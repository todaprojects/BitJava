package lt.toda.OOPbasicsEncapsulation.taskAtClass;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("vardas", "veisle");

        dog1.setName("Amsius");
        dog1.setVariety("Veisle1");

        Dog dog2 = new Dog("vardas", "veisle");

        dog2.setName("Kukis");
        dog2.setVariety("Veisle2");

        System.out.println(dog1.getName() + " " + dog1.getVariety());
        System.out.println(dog2.getName() + " " + dog2.getVariety());
    }
}
