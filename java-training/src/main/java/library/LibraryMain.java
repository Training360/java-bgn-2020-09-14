package library;

public class LibraryMain {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("author1", "title1", "000"));
        library.addBook(new Book("author2", "title2", "001"));
        library.addBook(new Book("author3", "title3", "002"));
        library.addBook(new Book("auth", "ti", "002"));

        Book book = library.findBookByRegNumber("000");
        System.out.println(book.getTitle());

        Book book1 = library.findBookByRegNumber("002");
        if (book1 == null) {
            System.out.println("NEM TALÁLTAM");
        }
        else {
            System.out.println(book1.getTitle());
        }

        System.out.println(
                library.hasAllBooksTitleSizeGreaterThanThree());
    }
}
