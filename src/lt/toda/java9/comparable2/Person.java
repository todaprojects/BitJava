package lt.toda.java9.comparable2;

class Person implements CustomComparable {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("\tperson id: %d, person name: %s", id, name);
    }

    @Override
    public boolean compare(CustomComparable p) {
        return this.id > ((Person) p).getId();
    }

    @Override
    public boolean equal(CustomComparable p) {
        return this.id == ((Person) p).getId();
    }

    @Override
    public int compareTo(CustomComparable p) {
        return this.name.compareTo(((Person) p).getName());
    }
}
