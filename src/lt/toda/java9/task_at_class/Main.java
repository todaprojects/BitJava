package lt.toda.java9.task_at_class;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[] {
                new Person("PersonName"),
                new Employee("EmployeeName"),
                new Janitor("JanitorName")
        };

        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
