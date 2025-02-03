package main.java.lld.designpattern.iterator;

import java.util.List;

// Concrete Aggregate (collects data), similar to ArrayList, HashSet, PriorityQueue
public class Library implements Aggregate {
  private List<Book> bookList;

  public Library(List<Book> books) {
    this.bookList = books;
  }

  @Override
  public Iterator createIterator() {
    return new BookIterator(bookList);
  }
}
