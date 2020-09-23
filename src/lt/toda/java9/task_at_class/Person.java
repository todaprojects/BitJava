package lt.toda.java9.task_at_class;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person name : " + this.name;
    }
}
