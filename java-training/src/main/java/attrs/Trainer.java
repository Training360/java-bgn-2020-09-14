package attrs;

public class Trainer {

    private String name = "Jack";

    private int yearOfBirth = 2001;

    public Trainer(String name, int yearOfBirth) {
        System.out.println("Konstruktor");
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
