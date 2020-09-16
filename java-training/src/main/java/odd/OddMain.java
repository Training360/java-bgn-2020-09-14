package odd;

import java.util.Scanner;

public class OddMain {

    public static void main(String[] args) {
        System.out.println("Addj meg egy számot!");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 10) {
            System.out.println("Nagyobb mint 10!");
        }
        else {
            System.out.println("Kisebb mint 10!");
        }
    }
}
