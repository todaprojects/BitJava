package lt.toda.OOPbasicsEncapsulation.taskAtClass;

public class Dog {
    private String name;
    private String variety;

    public Dog(String name, String variety) {
        this.name = name;
        this.variety = variety;
    }

    public String getName() {
        return name;
    }

    public String getVariety() {
        return variety;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
