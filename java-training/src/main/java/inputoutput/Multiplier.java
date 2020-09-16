package inputoutput;

import java.util.Scanner;

public class Multiplier {

    public static void main(String[] args) {
        System.out.println("Add meg az első számot!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Add meg a 10második számot!");
        int b = scanner.nextInt();
        System.out.println(a + " * " + b + " = " + a * b);
    }
}
