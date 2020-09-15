package lt.toda.sprint2;

import java.io.*;
import java.util.Scanner;

public class HomeWork3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n------------------------ Exceptions, I/O ------------------------");
        System.out.println("\n3. užduotis:");

        try {
            double res = divideNumber10(0);
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        // =================================================================
        System.out.println("\n4. užduotis:");

        File phoneNumbers = new File("./data/phoneNumbers.csv");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(phoneNumbers))) {
            String fileLine = bufferedReader.readLine();
            while (fileLine != null) {
                System.out.print("\t|");
                for (String line : fileLine.split(",")) {
                    System.out.printf(" %-12s |", line);
                }
                System.out.println();
                fileLine = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.out.println("\tduomenų failas \"" + phoneNumbers + "\" nerastas");
        }


        // =================================================================
        System.out.println("\n5. užduotis:");

        File dataFromConsole = new File("./data/dataFromConsole.csv");

        boolean isNewWrite = true;
        while (true) {
            System.out.print("\tar norite įvesti naują įrašą į duomenų failą? \"TAIP\" / \"NE\" ");
            String ans = scanner.nextLine();
            // failas perašomas
            if (isNewWrite) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dataFromConsole, false))) {
                    bufferedWriter.write("Name:,Age:,Phone:,\n");
                    isNewWrite = false;
                } catch (Exception e) {
                    System.out.println("\tduomenų failas \"" + dataFromConsole + "\" nerastas");
                }
            }
            //failas papildomas
            if ("TAIP".equalsIgnoreCase(ans)) {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dataFromConsole, true))) {
                    for (String input : getDataFromConsole()) {
                        bufferedWriter.write(input);
                        bufferedWriter.write(",");
                    }
                    bufferedWriter.write("\n");
                    System.out.println("\tduomenys sėkmingai išsaugoti faile " + dataFromConsole + "\n");
                } catch (Exception e) {
                    System.out.println("\tduomenų failas \"" + dataFromConsole + "\" nerastas");
                }
            } else if ("NE".equalsIgnoreCase(ans)) {
                break;
            } else {
                System.out.println("\tįvesta neteisinga komanda: " + ans + "! ");
            }
        }


        // =================================================================
        System.out.println("\n6. užduotis:");

        writeFilteredData();

    }

    static double divideNumber10(int number) throws ArithmeticException {
        try {
            return 10 / number;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("\tklaida: dalyba \"10/" + number + "\" negalima");
        }
    }

    static String[] getDataFromConsole() {
        String[] input = new String[3];
        System.out.print("\tįveskite vardą: ");
        // tikrinamas vardo įvedimas, - ar žodyje yra tik raidės
        while (true) {
            input[0] = scanner.nextLine();
            if ("".equals(input[0])) {
                System.out.print("\tklaida: neįvedėte vardo! pakartokite: ");
            } else if (input[0].matches(".*?\\d+.*?|(.*?\\W+.*?)^\\s*")) {
                System.out.print("\tklaida: įvesti neleistini simboliai! pakartokite: ");
            } else {
                break;
            }
        }
        System.out.print("\tįveskite amžių: ");
        // tikrinamas amžiaus įvedimas, - ar įvesti tik skaitmenys
        while (true) {
            input[1] = scanner.nextLine();
            if ("".equals(input[1])) {
                System.out.print("\tklaida: neįvedėte amžiaus! pakartokite: ");
            } else if (input[1].matches(".*?\\D+.*?")) {
                System.out.print("\tklaida: įvesti neleistini simboliai! pakartokite: ");
            } else {
                break;
            }
        }
        System.out.print("\tįveskite telefono nr: ");
        // tikrinamas telefono įvedimas, - ar įvesti tik skaitmenys ir/arba "-"
        while (true) {
            input[2] = scanner.nextLine();
            if ("".equals(input[2])) {
                System.out.print("\tklaida: neįvedėte telefono nr! pakartokite: ");
            } else if (input[2].matches("([^0-9]+^-[^0-9]+)|([^0-9]+)|\\d*-{2,100}\\d*")) {
                System.out.print("\tklaida: įvesti neleistini simboliai! pakartokite: ");
            } else {
                break;
            }
        }
        return input;
    }

    static String getFilteredData() {
        File phoneNumbers = new File("./data/phoneNumbers.csv");
        StringBuilder filteredData = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(phoneNumbers))) {
            String fileLine = bufferedReader.readLine();
            while (fileLine != null) {
                String[] line = fileLine.split(",");
                try {
                    int age = Integer.parseInt(line[1]);
                    if (age > 18) {
                        filteredData.append(line[0]).append(",").append(line[1]).append(",").append(line[2]).append(String.format("%n"));
                    }
                } catch (Exception e) {
                    filteredData.append(line[0]).append(",").append(line[1]).append(",").append(line[2]).append(String.format("%n"));
                }
                fileLine = bufferedReader.readLine();
            }
        } catch (Exception e) {
            System.out.println("\tduomenų failas \"" + phoneNumbers + "\" nerastas");
            return "";
        }
        return filteredData.toString();
    }

    static void writeFilteredData() {
        String filteredData = getFilteredData();
        if (!"".equals(filteredData)) {
            File filteredPhoneNumbers = new File("./data/filteredPhoneNumbers.csv");

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filteredPhoneNumbers))) {
                String[] filteredDataArr = filteredData.split("\n");
                for (String data : filteredDataArr) {
                    bufferedWriter.write(data);
                }
                System.out.println("\tfiltruoti duomenys sėkmingai išsaugoti faile \"" + filteredPhoneNumbers + "\"\n");
            } catch (Exception e) {
                System.out.println("\tduomenų failas \"" + filteredPhoneNumbers + "\" nerastas");
            }
        } else {
            System.out.println("\tfiltruotų duomenų įrašymas neįvyko!");
        }
    }
}
