package lt.toda.java6.task1;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Name");
        person.setSurname("Surname");
        person.setAge(100);

        System.out.println("Person name: " + person.getName());
        System.out.println("Person surname: " + person.getSurname());
        System.out.println("Person age: " + person.getAge());

    }
}

class Person {
    private String name;
    private String surname;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
