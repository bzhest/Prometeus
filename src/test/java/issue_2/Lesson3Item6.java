package issue_2;

import java.util.Scanner;

/**
 * Created by SYSTEM on 07.03.2017.
 */
public class Lesson3Item6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 2 numbers");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        if (first%second==0 && first > second){
            System.out.println(first + " devides on " + second + " without reminder " );
        } else if (first%second!=0 && first > second){
            System.out.println(first + " devides on " + second + " with reminder ");
        } else if (second%first==0 && first < second){
            System.out.println(second + " devides on " + first  + " without reminder " );
        }else {
            System.out.println(second + " devides on " + first + " with reminder " );
        }

    }

}
