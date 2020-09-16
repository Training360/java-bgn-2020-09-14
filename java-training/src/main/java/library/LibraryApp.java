package library;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        LibraryScreen screen = new LibraryScreen();
        Scanner scanner = new Scanner(System.in);
        for (String selectedMenu = "0"; !selectedMenu.equals("3");) {
            screen.printMenu();
            selectedMenu = scanner.nextLine();
            System.out.println("A választásod: " + selectedMenu);
            if (selectedMenu.equals("1")) {
                screen.createBook();
            }
            if (selectedMenu.equals("2")) {
                screen.printBooks();
            }
            if (selectedMenu.equals("4")) {
                screen.save();
            }
            if (selectedMenu.equals("5")) {
                screen.load();
            }
        }
    }
}
