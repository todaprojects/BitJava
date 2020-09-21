package lt.toda.java4;

import java.util.Arrays;

public class HomeWorkJava4 {
    public static void main(String[] args) {

        int[] numbers = {17, 33, 41, 54, 89, -67, 38, 48, 2, 6, 40, -5, 20, 97, 13, 15, -37, 73, 59, 1};

        System.out.println("\n------------------------ Funkcijos ------------------------");
        System.out.println("\n1. atsakymas:");

        int minNumber = getMinNumber(numbers);
        System.out.println("\tmažiausias skaičius: " + minNumber);


        // ==================================================================
        System.out.println("\n2. atsakymas:");

        int maxNumber = getMaxNumber(numbers);
        System.out.println("\tdidžiausias skaičius: " + maxNumber);


        // ==================================================================
        System.out.println("\n3. atsakymas:");

        int sumOfNumbers = getSumOfNumber(numbers);
        System.out.println("\tmasyvo skaičių suma: " + sumOfNumbers);


        // ==================================================================
        System.out.println("\n4. atsakymas:");

        int[] sortedNumbers = getSortedNumber(numbers);
        System.out.println("\tišrykiuotas masyvas: " + Arrays.toString(sortedNumbers));
    }

    static int getMinNumber(int[] numbers) {
        int minNumber = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }

    static int getMaxNumber(int[] numbers) {
        int minNumber = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }

    static int getSumOfNumber(int[] numbers) {
        int sumOfNumbers = 0;
        for (int number : numbers) {
            sumOfNumbers += number;
        }
        return sumOfNumbers;
    }

    static int[] getSortedNumber(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
}
