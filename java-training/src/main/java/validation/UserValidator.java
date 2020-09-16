package validation;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return isNotEmpty(username)
                && notContainsSpace(username)
                && username.length() > 0;
    }

    private boolean notContainsSpace(String username) {
        return username.indexOf(" ") < 0;
    }


    public boolean isValidPassword(String password1, String password2) {
        return isNotEmpty(password1) &&
                lengthIsGreaterOrEqualThanEight(password1) &&
                equals(password1, password2)
                ;
    }

    public boolean isValidEmail(String email) {
        return containsAt(email) &&
            containsDotAfterAt(email) &&
            notFirstAt(email) &&
            notLastDot(email);
    }

    private boolean notLastDot(String email) {
        return email.indexOf(".") != email.length() - 1;
    }

    private boolean notFirstAt(String email) {
        return email.indexOf("@") != 0;
    }

    private boolean containsDotAfterAt(String email) {
        return email.indexOf(".") > email.indexOf("@") + 1;
    }

    private boolean containsAt(String email) {
        return email.indexOf("@") > 0;
    }



    public boolean isNotEmpty(String s) {
        return s != null;
    }

    public boolean lengthIsGreaterOrEqualThanEight(String s) {
        return s.length() >= 8;
    }

    public boolean equals(String s1, String s2) {
        return s1.equals(s2);
    }
}
