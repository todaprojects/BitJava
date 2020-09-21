package lt.toda.java7.task3;

public class Computer {
    private String manufacturer;
    private Cpu cpu;
    private Os os;

    public Computer(String manufacturer, Cpu cpu, Os os) {
        this.manufacturer = manufacturer;
        this.cpu = cpu;
        this.os = os;
    }

    @Override
    public String toString() {
        return "This computer is made by \"" + manufacturer
                + "\", it's cpu is \"" + cpu.toString()
                + "\" and it runs " + os.toString() + ".";
    }
}
