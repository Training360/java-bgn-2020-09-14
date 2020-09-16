package employeestart;

import java.time.LocalDate;

public class Employee {

    private String name;

    private LocalDate dateOfBirth;

    private LocalDate beginEmployment;

    public Employee(String name, LocalDate dateOfBirth, TimeMachine timeMachine) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.beginEmployment = timeMachine.currentDate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getBeginEmployment() {
        return beginEmployment;
    }
}
