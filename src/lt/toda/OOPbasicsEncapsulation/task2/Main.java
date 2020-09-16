package lt.toda.OOPbasicsEncapsulation.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.print("\tįveskite studento vardą: ");
        student.setName(scanner.nextLine());

        System.out.print("\tįveskite studento amžių: ");
        while (true) {
            try {
                int age = new Scanner(System.in).nextInt();
                student.setAge(age);
                break;
            } catch (Exception e) {
                System.out.print("\tKlaida: neteisingai įvestas amžius! Pakartokite: ");
            }
        }

        System.out.print("\tįveskite fakulteta: ");
        student.setFaculty(scanner.nextLine());

        System.out.println("\nĮvesti duomenys:");
        System.out.println("\tstudento vardas: " + student.getName());
        System.out.println("\tstudento amžius: " + student.getAge());
        System.out.println("\tfakultetas: " + student.getFaculty());

    }
}

class Student {
    private String name;
    private int age;
    private String faculty;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
