package validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTest {

    @Test
    void testNormalUsername() {
        // GIVEN - WHEN - THEN (ASSERT)

        // GIVEN
        UserValidator userValidator = new UserValidator();

        // WHEN
        boolean result = userValidator.isValidUsername("JohnDoe");

        // THEN
        assertTrue(result);
    }

    @Test
    void testShortUsername() {
        UserValidator userValidator = new UserValidator();

        assertTrue(userValidator.isValidUsername("J"));
    }

    @Test
    void testHungarianCharacters() {
        assertTrue(new UserValidator().isValidUsername("árvíztűrőtükörfúrógép"));
    }

    @Test
    void testNull() {
        assertFalse(new UserValidator().isValidUsername(null));
    }

    @Test
    void testContainsSpace() {
        assertFalse(new UserValidator().isValidUsername("Jack Doe"));
    }
}
