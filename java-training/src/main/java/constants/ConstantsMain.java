package constants;

import java.util.Random;

public class ConstantsMain {

    public static void main(String[] args) {
        double r = 10.6;

        double t = r * r * Math.PI;

        System.out.println(t);

//        int i = (int) t;

        int i = (int) Math.round(t);

        System.out.println(i);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

        int j = Integer.MAX_VALUE;

        System.out.println(j);
        j++;
        System.out.println(j);

        System.out.println(Math.addExact(3, 4));
//        System.out.println(Math.addExact(Integer.MAX_VALUE, 1));


        Random random = new Random();
        System.out.println(random.nextInt(10));

        System.out.println(random.nextInt(6) + 1);
    }
}
