package lists;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("John Doe 1");
        names.add("Jane Doe 2");
        names.add("John Doe 3");
        names.add("John Doe 4");

        System.out.println(names);

        System.out.println(names.get(2));

        System.out.println(names.contains("John Doe 1"));

        System.out.println(names.indexOf("John Doe 3"));

        names.remove("John Doe 3");

        System.out.println(names);

        names.remove(0);

        System.out.println(names);

        System.out.println(names.size());

        names.clear();

        System.out.println(names);

        names.add("John Smith");

        System.out.println(names);

        names.add("John Smith 2");
        names.add("John Smith 3");
        names.add("John Smith 4");
        names.add("John Smith 5");

        System.out.println(names);

        for (String name: names) {
            System.out.println("A nev: " + name);
        }
    }
}
