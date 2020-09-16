package employeestart;

import java.time.LocalDate;

public class TimeMachine {

    private boolean fake;

    public TimeMachine(boolean fake) {
        this.fake = fake;
    }

    public LocalDate currentDate() {
        return fake ? LocalDate.of(2020, 1, 1) : LocalDate.now();
    }
}
