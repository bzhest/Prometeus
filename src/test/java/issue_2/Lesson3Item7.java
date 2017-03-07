package issue_2;

import java.util.Scanner;

/**
 * Created by SYSTEM on 07.03.2017.
 */
public class Lesson3Item7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a and b values");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double x;
        if(a!=0 && b!=0) {
            x = -b / a;
            System.out.println("x = " + x);
        } else if (a==0 && b==0){
            System.out.println("Exist unlimited count of resolvness");
        } else if (a==0 && b!=0){
            System.out.println("equotation haven't resolvness");
        }
    }
}
    /*Write a program that solves an equation of the form a x + b = 0 . The program should prompt the
        user for values of a and b, then solve the equation for x and print the results. The program should
        take appropriate action if a is zero*/