package library;

import java.util.List;
import java.util.Scanner;

public class LibraryScreen {

    private Library library = new Library();

    public void printMenu() {
        System.out.println("Válassz menüpontot!");
        System.out.println("1. Könyv felvétele");
        System.out.println("2. Könyvek listázása");
        System.out.println("3. Kilépés");
        System.out.println("4. Mentés");
        System.out.println("5. Betöltés");
    }

    public void createBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg az írót!");
        String author = scanner.nextLine();
        System.out.println("Add meg a címet!");
        String title = scanner.nextLine();
        System.out.println("Reg számot!");
        String regNumber = scanner.nextLine();
        Book book = new Book(author, title, regNumber);
        library.addBook(book);
    }

    public void printBooks() {
        List<Book> books = library.getBooks();
        for (Book book: books) {
            System.out.println(book.getAuthor() + " - " + book.getTitle() + " ("
                + book.getRegNumber() + ")");
        }
    }

    public void save() {
        System.out.println("Mentek");
        library.save();
        System.out.println("Mentés kész");
    }

    public void load() {
        System.out.println("Betöltök");
        library.load();
        System.out.println("Betöltés kész");
    }
}
