package firm;

import java.util.ArrayList;
import java.util.List;

public class Firm {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findById(long id) {
        for (Employee employee: employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public double averageSalary() {
        int sum = 0;
        for (Employee employee: employees) {
            sum += employee.getSalary();
        }
        return sum / employees.size();
    }

    public boolean allEmployeesSalaryGreaterThan(int minSalary) {
        for (Employee employee: employees) {
            if (employee.getSalary() < minSalary) {
                return false;
            }
        }
        return true;
    }
}
