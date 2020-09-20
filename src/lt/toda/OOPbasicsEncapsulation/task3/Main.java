package lt.toda.OOPbasicsEncapsulation.task3;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.setName("Nicolas");
        employee1.setPosition("Trainee");
        employee1.setSalary(2200);

        Employee[] employees = {
                new Employee("Peter", "Redactor", 2750),
                new Employee("Sally", "Writer", 4900),
                employee1
        };

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
