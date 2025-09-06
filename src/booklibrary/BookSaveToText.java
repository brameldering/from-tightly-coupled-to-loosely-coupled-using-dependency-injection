package booklibrary;

import java.awt.print.Book;

public class BookSaveToText implements BookSaveFormat {
  public void saveFormat(Book book) {
    System.out.println("Save to Text " + book);
  }
}
