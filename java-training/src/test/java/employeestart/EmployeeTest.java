package employeestart;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmployeeTest {

    @Test
    void testModifyName() {
        // Given
        Employee employee = new Employee("John Doe",
                LocalDate.of(2000, 8, 10),
                new TimeMachine(true));
        employee.setName("Jack Doe");

        assertEquals("Jack Doe", employee.getName());
    }

    @Test
    void testBeginEmployment() {
        Employee employee = new Employee("John Doe", LocalDate.of(2000, 8, 10),
                new TimeMachine(true));

        assertEquals(LocalDate.of(2020, 1, 1),
                employee.getBeginEmployment());
    }
}
