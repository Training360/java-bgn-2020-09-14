package strings;

public class StringMain {

    public static void main(String[] args) {
        String s = "almakorte";

        System.out.println(s.indexOf("alma"));
        System.out.println(s.indexOf("korte"));

        System.out.println(s.length());

        System.out.println(s.substring(2, 6));
            // bal oldali benne lesz
            // jobb oldali karakter nem lesz benne
        //

        System.out.println("meggy".length());

        String s2 = "meggy";
        System.out.println(s2.length());

        String s3 = new String("meggy");
        System.out.println(s3.length());
    }

    public boolean parosEEsNagyobbEMintTiz(int i) {
        return i % 2 == 0 && i > 10;
    }
}
