package prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumMain {

    public static void main(String[] args) {
        SumService sumService = new SumService();
        List<Integer> numbers = sumService.readNumbers();

        SumResult sumResult = sumService.iterate(numbers);
        System.out.println(sumResult.getSum());
        System.out.println(sumResult.getMin());
    }
}
