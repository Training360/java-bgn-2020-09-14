package prog;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumServiceTest {

    @Test
    public void testSum() {
        SumService sumService = new SumService();
        SumResult result = sumService.iterate(List.of(1, 2, 3, 4, 5));

        assertEquals(15, result.getSum());
    }

    @Test
    public void testMin() {
        SumService sumService = new SumService();
        SumResult result = sumService.iterate(List.of(1, 2, 3, 4, 5));

        assertEquals(1, result.getMin());
    }

    @Test
    public void testWithEmpty() {
        SumService sumService = new SumService();
        SumResult result = sumService.iterate(List.of());

        assertEquals(0, result.getSum());
    }

}
