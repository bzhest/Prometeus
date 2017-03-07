package issue_2;

import java.util.Scanner;

/**
 * Created by SYSTEM on 07.03.2017.
 */
public class Lesson3Item8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Input 2 float values");
        float first = scanner.nextFloat();
        float second = scanner.nextFloat();
        if (Math.abs(first)> Math.abs(second)){
            System.out.println("Magnitude of " + first + " is bigger then " + second);
        } else {
            System.out.println("Magnitude of " + second + " is bigger then " + first);
        }

    }
}
    /*Write a program that will ask the user for two float values and compare their magnitudes. For
        example, if the user entered 3 and -9, the program should respond that -9 has the greater
        magnitude.*/