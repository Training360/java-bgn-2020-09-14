package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileHandlingMain {

    public static void main(String[] args) {
        Path path = Path.of("fruits.txt");
        try {
            List<String> fruits = Files.readAllLines(path);
            for (String fruit: fruits) {
                System.out.println(fruit);
            }

        } catch (IOException e) {
            System.out.println("NINCS MEG A FÁJL!");
            //e.printStackTrace();
        }
    }
}
