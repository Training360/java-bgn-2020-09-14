package arraylist;

import java.util.Calendar;

public class CapsulesMain {

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("red");
        capsules.addLast("red");
        capsules.addLast("red");
        capsules.addLast("yellow");

        System.out.println(capsules.getColors());
    }
}
