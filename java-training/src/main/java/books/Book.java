package books;

/**
 * Ez egy könyv.
 */
public class Book {

    private String author;

    private String title;

    private String regNumber;

    /**
     * Létrehoz egy könyvet.
     *
     * @param author ez az írója
     * @param title ez a címe
     */
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void register(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
}
