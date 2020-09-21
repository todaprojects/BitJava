package lt.toda.java2;

public class HomeWork1of2 {
    public static void main(String[] args) {

        System.out.println("\n------------------------ Primityvūs duomenų tipai ------------------------");

        System.out.println("\n\tint tipo maximali teigiama reikšmė: " + Integer.MAX_VALUE);
        System.out.println("\tint tipo maximali neigiama reikšmė: " + Integer.MIN_VALUE);
        System.out.println("\n1.a atsakymas:");
        System.out.println("\tgyventojų skaičius žemėje yra 7810052089, - per didelis skaičius int tipo kintamajam.");
        System.out.println("\n1.b atsakymas:");
        System.out.println("\tlietuvišką asmens kodą reikėtų saugoti 'long' tipo kintamajame.");

        System.out.println("\n1.a atsakymas:");
        int sum = Integer.MAX_VALUE + 1;
        System.out.println("\tInteger.MAX_VALUE + 1 = " + sum +
                "\n\tGautas atsakymas lygus 'Integer.MIN_VALUE' reikšmei. Šis reiškinys vadinamas 'overflow'.");


        System.out.println("\n------------------------ Operatoriai ------------------------");

        System.out.println("\n1 atsakymas:");
        int remainder = 5 % 2;
        System.out.println("\t5 dalybos iš 2 liekana = " + remainder);

        System.out.println("\n2 atsakymas:");

        try {
            System.out.println("\t2 / 0 = " + 2 / 0);
        } catch (Exception e) {
            System.out.println("\t gauta klaida: \"" + e + "\"" + ".");
        }

        System.out.println("\n3 atsakymas:");
        int x = 10; // gal salygoje buvo palikta klaida, - nepatrašyta 'int' kintamojo deklaracijoje?
        int y = 5;
        System.out.print("\t");
        System.out.println(x == 10 && y <= 5); // true
        System.out.print("\t");
        System.out.println(x <= y && y > 5); // false
        System.out.print("\t");
        System.out.println("abc" instanceof String); // true


        System.out.println("\n------------------------ Stringai ------------------------");

        System.out.println("\n1 atsakymas:");
        System.out.println("\tSveiki, Jonai,\n\tkaip sekasi?");

        System.out.println("\n2 atsakymas:");
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

        System.out.println("\ta: \""+ string.toLowerCase() + "\"");
        System.out.println("\tb: \""+ string.toUpperCase() + "\"");
        System.out.println("\tc: \""+ string.replace('o','z') + "\"");
        System.out.println("\td: \""+ string.endsWith("elit") + "\"");

    }
}
