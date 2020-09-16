package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class BooksFileMain {

    public static void main(String[] args) {
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

                System.out.println("Author: " + author);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
