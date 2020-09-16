package intro;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        String message = "Hello World!!!";
        System.out.println(message);
        message = "Hello World Mod!!!";

        System.out.println(message);

        System.out.println("Add meg a nevedet!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

        System.out.println("Add meg a szuletesi helyedet!");
        String placeOfBirth = scanner.nextLine();
        System.out.println(placeOfBirth);

        System.out.println("Add meg a szuletesi eved!");
        int yearOfBirth = scanner.nextInt();
        System.out.println(yearOfBirth + " 2000");
    }
}
