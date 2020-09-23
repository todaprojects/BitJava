package lt.toda.java9.comparable2;

public class Main {

    static void sort(CustomComparable[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compare(array[j + 1])) {
                    CustomComparable temporary = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temporary;
                } else if (array[j].equal(array[j + 1])) {
                    if (array[j].compareTo(array[j + 1]) > 0) {
                        CustomComparable temporary = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temporary;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Person[] persons = new Person[] {
                new Person(161,"Caroline"),
                new Employee(125, "Leonardo"),
                new Janitor(101, "Ted"),
                new Person(101,"Deanna"),
                new Employee(125, "Chelsea"),
                new Janitor(125, "Melissa"),
                new Person(161,"Roman"),
                new Employee(161, "Jessica"),
                new Janitor(143, "Paige")
        };

        // System.out.println("compare: " + "tomas".compareTo("daugela"));

        System.out.println("before sorting:");
        for (Person p : persons) {
            System.out.println(p);
        }

        sort(persons);
        System.out.println("after sorting \"id\" && \"name\"");
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
