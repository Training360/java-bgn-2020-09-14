package books;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérlek add meg a szerzőt!");
        String authorVar = scanner.nextLine();

        System.out.println("Kérlek add meg a címet!");
        String titleVar = scanner.nextLine();

        Book book = new Book(authorVar, titleVar);

        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());

        System.out.println("Kérlek add meg a regisztrációs számot!");
//        String regNumberVar = scanner.nextLine();
        book.register("98765");

        System.out.println("Reg number: " + book.getRegNumber());
    }
}
