package booklibrary;

import java.awt.print.Book;

public class BookPersistenceImpl implements BookPersistence {

  private final BookSaveFormat bookSaveFormat;

  public BookPersistenceImpl(BookSaveFormat bookSaveFormat) {
    this.bookSaveFormat = bookSaveFormat;
  }

  public void saveBook(Book book) {
    bookSaveFormat.saveFormat(book);
  }

}
