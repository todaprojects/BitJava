package lt.toda.OOPbasicsEncapsulation.task3;

public class Employee {
    private String name;
    private String position;
    private int salary;

    public Employee() {
        this.name = null;
        this.position = null;
        this.salary = 0;
    }

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee %s is %s and receives %d€ salary.", name, position, salary);
    }
}
