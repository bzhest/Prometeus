package issue_2;

import java.util.Scanner;

/**
 * Created by SYSTEM on 07.03.2017.
 */
public class Lesson3Item10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a,b and c");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discrimenant;

        discrimenant = b*b - 4*a*c;

        if (discrimenant>0 && a!=0){
            double x1= (-b - Math.pow(discrimenant,1/2))/2*a;
            double x2= (-b + Math.pow(discrimenant,1/2))/2*a;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discrimenant>0 && a==0){
            double x2;
            double x1 = x2 =  -c/b;
            System.out.println("x1 = x2 =  " + x1);
        } else if (discrimenant == 0 && a!=0){
            double x2;
            double x1 = x2 = -b/2*a;
            System.out.println("x1 = x2 = " + x1);
        } else {
            System.out.println("no square roots");
        }

    }
}
/*Write a program that determines the values of the roots, root1 and root2, of the quadratic equation
after asking the user to input values for a, b, and c. The program should take show appropriate
messages if:
(a) the value of a is zero (in which case, see Exercise #4), and
(b) there are two, one, or zero real roots (you cannot take the square root of a negative
number).*/