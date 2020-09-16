package library;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryRepository {

    public void writeBooks(List<Book> books) {
        List<String> lines = new ArrayList<>();
        for (Book book: books) {
            lines.add(book.getAuthor() + ";" + book.getTitle() + ";" + book.getRegNumber());
        }
        Path path = Path.of("books.txt");
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Book> readBooks() {
        List<Book> books = new ArrayList<>();
        Path path = Path.of("books.txt");
        try {
            List<String> lines = Files.readAllLines(path);

            for (String line: lines) {
                System.out.println(line);

                List<String> parts = Arrays.asList(line.split(";"));
                System.out.println(parts);

                String author = parts.get(0);
                String title = parts.get(1);
                String regNumber = parts.get(2);

                books.add(new Book(author, title, regNumber));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return books;
    }
}
