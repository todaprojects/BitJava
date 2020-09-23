package lt.toda.java9.comparable;

class Person implements CustomComparable_1_feature {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }


    @Override
    public String toString() {
        return String.format("\tperson id: %d, person name: %s", id, name);
    }

    @Override
    public boolean compare(CustomComparable_1_feature p) {
        return this.id > ((Person) p).getId();
    }
}
