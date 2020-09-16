package prog;

import java.util.ArrayList;
import java.util.List;

public class ProgMain {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(36);
        numbers.add(98);

        System.out.println(numbers);

//        int sum = 0;
//        for (int i = 0; i < numbers.size(); i++) {
//            sum = sum + numbers.get(i);
//            System.out.println("A " + i + ". elem: " + numbers.get(i));
//        }
//        System.out.println(sum);

        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println(sum);

    }
}
