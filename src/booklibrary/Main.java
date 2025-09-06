package booklibrary;

import java.awt.print.Book;

public class Main {
  public static void main(String[] args) {

    Book book = new Book();

//    BookSaveFormat bookSaveFormat = new BookSaveToText();
    BookPersistence bookPersistence = new BookPersistenceImpl(new BookSaveToText());

    bookPersistence.saveBook(book);
  }
}