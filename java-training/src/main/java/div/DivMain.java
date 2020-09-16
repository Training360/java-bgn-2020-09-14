package div;

import java.util.Scanner;

public class DivMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy egész számot!");
        int i = scanner.nextInt();

        System.out.println(i % 2 == 0 ? "páros" : "páratlan");
    }
}
