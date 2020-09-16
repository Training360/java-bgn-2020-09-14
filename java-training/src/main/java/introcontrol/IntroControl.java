package introcontrol;

public class IntroControl {

    public static final int NUMBER_OF_MONTHS = 12;

    public int substractTenIfGreaterThanTen(int number) {
        if (number <= 10) {
            return number * NUMBER_OF_MONTHS;

        }
        else {
            return number - 10;
        }


    }
}
