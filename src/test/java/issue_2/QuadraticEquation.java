package issue_2;

/**
 * Created by SYSTEM on 24.02.2017.
 */
public class QuadraticEquation {

    public static void main(String[] args) {
        double a = 0;
        double b = 10;
        double c = 0;
        double discremenant;
        //дискреминант
        discremenant = b*b - 4*a*c;
        if(discremenant>0){
            double x1;
            double x2;
            x1 = (-b+Math.sqrt(discremenant))/(2*a);
            x2 = (-b-Math.sqrt(discremenant))/(2*a);
            System.out.println (x1);
            System.out.println (x2);
        }
        else if (discremenant==0){
            double x1;
            double x2;
            x1=-b/(2*a);
            x2=-b/(2*a);
            System.out.println (x1);
            System.out.println (x2);
        }
        else {
            String x1 = "";
            String x2 = "";
            System.out.println (x1);
            System.out.println (x2);
        }
        System.out.println (discremenant);


        //PUT YOUR CODE HERE
    }
}
