package main.java.lld.librarymanagementsystem;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BookItem extends Book {
  private static final Logger logger = Logger.getLogger(BookItem.class.getSimpleName());
  private String id;
  private boolean isReferenceOnly;
  private Date borrowed;
  private Date dueDate;
  private double price;
  private BookStatus bookStatus;
  private Rack location;
  private Member reservedMember;

  public BookStatus getBookStatus() {
    return this.bookStatus;
  }

  public boolean checkout(Member member) {
    if (isReferenceOnly) {
      logger.warning("This book is for reference only");
      return false;
    }
    if (bookStatus != BookStatus.AVAILABLE) {
      logger.info("This book is " + bookStatus);
      return false;
    }
    updateBookItemStatus(BookStatus.CHECKEDOUT);
    return true;
  }

  public void updateBookItemStatus(BookStatus bookStatus) {
    this.bookStatus = bookStatus;
  }

  public Member getReservedMember() {
    return reservedMember;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public String getId() {
    return id;
  }

  public void updateDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }
}
