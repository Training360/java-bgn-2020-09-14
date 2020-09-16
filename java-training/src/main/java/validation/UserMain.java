package validation;

public class UserMain {

    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();

        System.out.println(userValidator.isValidUsername("John Doe"));
        System.out.println(userValidator.isValidUsername("J"));
        System.out.println(userValidator.isValidUsername("árvíztűrőtükörfúrógép"));

        System.out.println(userValidator.isValidUsername(null));
        System.out.println(userValidator.isValidUsername(""));

        System.out.println("Jelszó");

        System.out.println(userValidator.isValidPassword("aaaabbbbcccc", "aaaabbbbcccc"));
        System.out.println(userValidator.isValidPassword("aaaabbbb", "aaaabbbb"));

        System.out.println(userValidator.isValidPassword("aaaabbbb", "bbbbaaaa"));
        System.out.println(userValidator.isValidPassword("aa", "aa"));

        System.out.println(userValidator.isValidPassword(null, null));
        System.out.println(userValidator.isValidPassword("aaaabbbb", null));
        System.out.println(userValidator.isValidPassword(null, "aaaabbbb"));

        System.out.println("Email");

        System.out.println(userValidator.isValidEmail("istvan@training.com"));
        System.out.println(userValidator.isValidEmail("is@tr.com"));
        System.out.println(userValidator.isValidEmail("is@tr"));
        System.out.println(userValidator.isValidEmail("istr.com"));
        System.out.println(userValidator.isValidEmail("istr.co@m"));
        System.out.println(userValidator.isValidEmail("istr@.m"));
        System.out.println(userValidator.isValidEmail("@istr.m"));
        System.out.println(userValidator.isValidEmail("is@trm."));
    }
}
