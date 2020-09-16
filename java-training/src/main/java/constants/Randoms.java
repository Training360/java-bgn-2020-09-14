package constants;

import java.util.Random;

public class Randoms {

    public static void main(String[] args) {
        Random random = new Random(101);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(5) + 1);
        }
    }
}
