package types;

import java.util.Scanner;

public class OperatorsMain {

    public static void main(String[] args) {
        int i = 1;
//        i++;

//        i = i + 1;

        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();



        System.out.println(i >= 6 ? "nagyobb" : "kisebb");
    }
}
