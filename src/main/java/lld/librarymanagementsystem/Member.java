package main.java.lld.librarymanagementsystem;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Logger;

public class Member extends Account {
  private final static Logger logger = Logger.getLogger(Member.class.getSimpleName());
  private int BOOK_LENDING_LIMIT = 5;
  private Date dateOfMembership;
  private int totalBooksCheckedOut;

  public int getNumberOfCheckoutBooks() {
    return this.totalBooksCheckedOut;
  }

  private void incrementTotalBooksCheckedOut(int numberOfBooks) {
    this.totalBooksCheckedOut += numberOfBooks;
  }

  public boolean reserveBookItem(BookItem bookItem) {
    return true;
  }

  private void checkForFine(BookItem bookItem) {
    Date today = new Date();
    Date dueDate = bookItem.getDueDate();
    if (today.compareTo(dueDate) > 0) {
      long diff = today.getTime() - dueDate.getTime();
      long diffDays = diff/(24*60*60*1000);
      collectFine(this, diffDays);
    }
  }

  private void collectFine(Member member, long diffDays) {

  }

  public boolean checkOutBookItem(BookItem bookItem) {
    if (this.getNumberOfCheckoutBooks() >= BOOK_LENDING_LIMIT) {
      logger.info("Member has reached the maximum book lending limit");
      return false;
    }
    BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getId());
    if (bookReservation != null && !Objects.equals(bookReservation.getMemberId(), this.getId())) {
      logger.info("This book is reserved by another member");
      return false;
    }
    if (!bookItem.checkout(this)) {
      return false;
    }
    incrementTotalBooksCheckedOut(1);
    return true;
  }

  public boolean returnBookItem(BookItem bookItem) {
    checkForFine(bookItem);
    BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getId());
    if (bookReservation != null) {
      // book item has a pending reservation
      bookItem.updateBookItemStatus(BookStatus.RESERVED);
      bookReservation.sendBookAvailableNotification();
    }
    bookItem.updateBookItemStatus(BookStatus.AVAILABLE);
    return true;
  }

  public boolean renewBookItem(BookItem bookItem) {
    checkForFine(bookItem);
    BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getId());
    if (bookReservation != null && bookReservation.getMemberId() != this.getId()) {
      logger.info("This book is reserved by another member");
      this.totalBooksCheckedOut--;
      bookItem.updateBookItemStatus(BookStatus.AVAILABLE);
      bookReservation.sendBookAvailableNotification();
      return false;
    } else if (bookReservation != null) {
      bookReservation.updateBookReservationStatus(ReservationStatus.COMPLETED);
    }
    bookItem.updateBookItemStatus(BookStatus.CHECKEDOUT);
    bookItem.updateDueDate(new Date());
    return true;
  }
}
