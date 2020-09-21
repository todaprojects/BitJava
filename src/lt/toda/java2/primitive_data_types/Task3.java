package lt.toda.java2.primitive_data_types;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n------------------------ Sąlygos teiginiai ------------------------");

        System.out.print("įvesti savo amžių metais: ");

        int age = scanner.nextInt();
        scanner.nextLine();

        if (age >= 18 ) {
            System.out.print("\tgalite balsuoti");
            if (age >= 45) {
                System.out.print(" ir kandidatuoti");
            }
        } else {
            System.out.println("\tdar negalite balsuoti");
        }

        System.out.println("\n------------------------ Ciklai ------------------------");

        System.out.println("\n1 atsakymas:");

        boolean isFound = false;
        while (isFound) {
            System.out.println("it's found!");
        }

        System.out.println("\n2 atsakymas:");

        // while (!isFound) {   // <- amžinas ciklas
            System.out.println("not found yet...");
        // }

        System.out.println("\n3 atsakymas:");

        boolean isEcho = true;
        do {
            System.out.print("įveskite tekstą: ");
            String input = scanner.nextLine();
            if ("q".equals(input)) {
                isEcho = false;
            } else {
                System.out.println("jūsų įvestas tekstas: " + input);
            }
        } while (isEcho);

        System.out.println("\n4 atsakymas:");

        isEcho = true;
        do {
            System.out.print("įveskite tekstą: ");
            StringBuilder input = new StringBuilder(scanner.nextLine());
            if ("q".equals(input.toString())) {
                isEcho = false;
            } else {
                System.out.println("jūsų įvestas tekstas: " + input.reverse());
            }
        } while (isEcho);

        System.out.println("\n5 atsakymas:");

        System.out.print("įveskite tekstą: ");
        String inputNew = scanner.nextLine();

        for (int i = 0; i < inputNew.length(); i++) {
            System.out.println(inputNew.charAt(i) + " " + (i + 1));
        }
    }
}
