package lt.toda.sprint2;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("\n------------------------ Masyvai ------------------------");
        System.out.println("\n1. atsakymas:");
        String[] cities = {"Vilnius", "Kaunas", "Klaipėda", "Šiauliai", "Panevėžys", "Alytus", "Marijampolė", "Mažeikiai", "Jonava", "Utena"};

        System.out.println("\nciklas 'while':");
        int i = 0;
        while (i < cities.length) {
            System.out.print(cities[i] + " ");
            i++;
        }

        System.out.println("\n\nciklas 'enhanced for':");
        for (String city : cities) {
            System.out.print(city + " ");
        }

        System.out.println("\n\nciklas 'for':");
        for (int j = 0; j < cities.length; j++) {
            System.out.print(cities[j] + " ");
        }


        // =================================================================
        System.out.println("\n\n2. atsakymas:");
        Scanner scanner = new Scanner((System.in));

        System.out.print("\nĮveskite masyvo dydį: ");
        int size = scanner.nextInt();
        String[] array = new String[size];

        System.out.println("\nciklas 'while':");
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }

        System.out.println("\n\nciklas 'enhanced for':");
        for (String a : array) {
            System.out.print(a + " ");
        }

        System.out.println("\n\nciklas 'for':");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }


        // =================================================================
        System.out.println("\n\n3. atsakymas:");

        System.out.print("\nĮveskite masyvo dydį: ");
        size = scanner.nextInt();
        scanner.nextLine();

        String[] arrayNew = new String[size];

        for (int j = 0; j < arrayNew.length; j++) {
            System.out.print("\tįveskite masyvo " + (j + 1) + "-ąjį narį: ");
            arrayNew[j] = scanner.nextLine();
        }

        System.out.println("\nciklas 'while':");
        i = 0;
        while (i < arrayNew.length) {
            System.out.print(arrayNew[i] + " ");
            i++;
        }

        System.out.println("\n\nciklas 'enhanced for':");
        for (String a : arrayNew) {
            System.out.print(a + " ");
        }

        System.out.println("\n\nciklas 'for':");
        for (int j = 0; j < arrayNew.length; j++) {
            System.out.print(arrayNew[j] + " ");
        }


        // =================================================================
        System.out.println("\n\n4. atsakymas:");

        int[] numbers = {17, 33, 41, 54, 89, 67, 38, 48, 2, 6};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("masyvo reikšmių suma: " + sum);


        // =================================================================
        System.out.println("\n5. atsakymas:");

        sum = 0;
        double average = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
            average = (double) sum / numbers.length;
        }

        System.out.println("masyvo reikšmių vidurkis: " + average);


        // =================================================================
        System.out.println("\n6. atsakymas:");

        int length = numbers.length;

        System.out.println("\nmasyvo rikiavimas pagal 'insertion sort algoritmą': ");
        for (int j = 0; j < length; j++) {
            int minIndex = j;
            for (int k = j + 1; k < length; k++)
                if (numbers[k] < numbers[minIndex]) {
                    minIndex = k;
                }
            System.out.print(numbers[minIndex] + " ");
            numbers[minIndex] = numbers[j];
        }

    }
}
