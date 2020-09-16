package firm;

public class FirmMain {

    public static void main(String[] args) {
        Firm firm = new Firm();
        firm.addEmployee(new Employee(1, "John Doe", 100_000));
        firm.addEmployee(new Employee(2, "Jane Doe", 200_000));
        firm.addEmployee(new Employee(3, "Jack Doe", 300_000));

        System.out.println(firm.findById(2).getName());


        System.out.println(firm.averageSalary());

        System.out.println(firm.allEmployeesSalaryGreaterThan(50_000));

        System.out.println(firm.allEmployeesSalaryGreaterThan(250_000));
    }
}
