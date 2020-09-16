package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByRegNumber(String regNumber) {
        for (Book book: books) {
            if (book.getRegNumber().equals(regNumber)) {
                return book;
            }
        }
        return null;
    }

    public boolean isBookWithoutRegNumber() {
        for (Book book: books) {
            if (book.getRegNumber().equals("")) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAllBooksTitleSizeGreaterThanThree() {
        for (Book book: books) {
            if (book.getTitle().length() < 3) {
                return false;
            }
        }
        return true;
    }

    public List<Book> getBooks() {
        return books;
    }
}
