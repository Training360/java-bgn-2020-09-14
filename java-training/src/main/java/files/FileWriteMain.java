package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileWriteMain {

    public static void main(String[] args) {
        Path path = Path.of("numbers.txt");
        List<String> numbers =
                List.of("one", "two", "three");
        try {
            Files.write(path, numbers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
