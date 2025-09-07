package booklibrary;

import java.awt.print.Book;

public class Main {
  public static void main(String[] args) {

    Book book = new Book();

    BookPersistence bookPersistenceText = new BookPersistenceImpl(new BookSaveToText());
    bookPersistenceText.saveBook(book);

    BookPersistence bookPersistenceToDB = new BookPersistenceImpl(new BookSaveToDB());
    bookPersistenceToDB.saveBook(book);
  }
}