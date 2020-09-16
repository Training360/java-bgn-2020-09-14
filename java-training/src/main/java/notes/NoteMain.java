package notes;

import java.util.Scanner;

public class NoteMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Note note = new Note();

        System.out.println("Add meg a neved!");
        note.setName(scanner.nextLine());

        System.out.println("Add meg a témát!");
        note.setTopic(scanner.nextLine());

        System.out.println("Add meg a szöveget!");
        note.setText(scanner.nextLine());

        System.out.println(note.getNoteText());
    }
}
