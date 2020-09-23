package lt.toda.java8.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter number \"x\": ");
        int x = scanner.nextInt();
        System.out.print("enter number \"y\": ");
        int y = scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter action (+, -, *, /): ");
        String action = scanner.nextLine();

        switch (action) {
            case "+": {
                System.out.println("StaticCalculator: " + StaticCalculator.add(x, y));
                break;
            }
            case "-": {
                System.out.println("StaticCalculator: " + StaticCalculator.subtract(x, y));
                break;
            }
            case "*": {
                System.out.println("StaticCalculator: " + +StaticCalculator.multiply(x, y));
                break;
            }
            case "/": {
                System.out.println("StaticCalculator: " + StaticCalculator.divide(x, y));
                break;
            }
        }

        InstanceCalculator ic = new InstanceCalculator();
        System.out.println("InstanceCalculator: " + ic.add(5, 9));
        System.out.println("InstanceCalculator: " + ic.subtract(5, 9));
        System.out.println("InstanceCalculator: " + ic.multiply(5, 9));
        System.out.println("InstanceCalculator: " + ic.divide(5, 9));
    }
}

class StaticCalculator {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }
}

class InstanceCalculator {
    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public double divide(int x, int y) {
        return (double) x / y;
    }
}