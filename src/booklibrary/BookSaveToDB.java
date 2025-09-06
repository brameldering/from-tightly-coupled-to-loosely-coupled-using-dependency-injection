package booklibrary;

import java.awt.print.Book;

public class BookSaveToDB implements BookSaveFormat {
  public void saveFormat(Book book) {
    System.out.println("Save to DB " + book);
  }
}
