package prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumService {

    public List<Integer> readNumbers() {
        List<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        System.out.println(numbers);
        return numbers;
    }

    public SumResult iterate(List<Integer> numbers) {
        if (numbers.size() == 0) {
            return new SumResult(0, 0);
        }
        int sum = 0;
        int min = numbers.get(0);
        int index = 0;
        //for (int number: numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number < min) {
                min = number;
                index = i;
            }
            sum += number;
        }

        return new SumResult(sum, min);
    }

    public int countOdds(List<Integer> numbers) {
        int count = 0;
        for (int number: numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
