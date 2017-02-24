package issue_2;

/**
 * Created by SYSTEM on 24.02.2017.
 */
public class QuadraticEquation {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;
        int d;
        //дискреминант
        d = (int)((b*b) - (4 *a*c));
        if(d>0){
            double x1;
            double x2;
            x1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
            x2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
        }
        else if (d==0){
            double x1;
            double x2;
            x1=-b/2*a;
            x2=-b/2*a;
        }
        else {
            x1 = "";
            x2 = "";
        }



        //PUT YOUR CODE HERE
    }
}
