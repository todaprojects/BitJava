package lt.toda.java7.task3;

public class App {
    public static void main(String[] args) {
        Computer hp = new Computer("hp", new Cpu("3.2GHz"), new Os("Windows 10"));
        System.out.println(hp.toString());
    }
}
