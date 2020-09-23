package lt.toda.java9.comparable;

public class Main {

    static void sort(CustomComparable_1_feature[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compare(array[j + 1])) {
                    CustomComparable_1_feature temporary = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temporary;
                }
            }
        }
    }

    public static void main(String[] args) {
        Person[] persons = new Person[] {
                new Person(112,"PersonName1"),
                new Employee(125, "EmployeeName1"),
                new Janitor(103, "JanitorName1"),
                new Person(101,"PersonName2"),
                new Employee(172, "EmployeeName2"),
                new Janitor(153, "JanitorName2"),
                new Person(161,"PersonName3"),
                new Employee(122, "EmployeeName3"),
                new Janitor(143, "JanitorName3")
        };

        System.out.println("before sorting:");
        for (Person p : persons) {
            System.out.println(p);
        }

        sort(persons);
        System.out.println("after sorting");
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
