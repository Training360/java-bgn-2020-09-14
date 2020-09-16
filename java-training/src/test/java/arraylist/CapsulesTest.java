package arraylist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CapsulesTest {

    static final int EXPECTED_SIZE = 2;

    @Test
    void testAdd() {
        Capsules capsules = new Capsules();
        capsules.addLast("red");
        capsules.addLast("yellow");

        assertEquals(EXPECTED_SIZE, capsules.getColors().size());
        assertEquals("red", capsules.getColors().get(0));

        assertEquals(List.of("red", "yellow"), capsules.getColors());
    }
}
