package introcontrol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntroControlTest {

    @Test
    void substractTenIfGreaterThanTen() {
        IntroControl introControl = new IntroControl();
        int result = introControl.substractTenIfGreaterThanTen(4);
        assertEquals(4, result);
    }

    @Test
    void substractTen() {
        IntroControl introControl = new IntroControl();
        int result = introControl.substractTenIfGreaterThanTen(10);
        assertEquals(10, result);
    }

    @Test
    void substractGreaterThanTen() {
        IntroControl introControl = new IntroControl();
        int result = introControl.substractTenIfGreaterThanTen(18);
        assertEquals(8, result);
    }
}