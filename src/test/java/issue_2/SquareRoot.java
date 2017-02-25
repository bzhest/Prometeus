package issue_2;

/**
 * Created by SYSTEM on 24.02.2017.
 */
public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = -18;
        double c = 27;
        double discriminant;

        discriminant = b*b - 4*a*c;
        if(discriminant>0 && a!=0){
            double x1;
            double x2;
            x1 = (-b+Math.sqrt(discriminant))/(2*a);
            x2 = (-b-Math.sqrt(discriminant))/(2*a);

            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
        else if (discriminant>0 && a==0){
            double x1;
            double x2;
            x1=-c/b;
            x2=-c/b;
                if (x1==-0.0 && x2==-0.0){
                    System.out.println("x1=" + (-x1));
                    System.out.println("x2=" + (-x2));
            }else {
                    System.out.println("x1=" + x1);
                    System.out.println("x2=" + x2);
                }
        }
        else if (a==0 && b==0){
            double x1;
            double x2;
            System.out.println("x1=");
            System.out.println("x2=");
        }
        else if (discriminant==0 && a!=0){
            double x1;
            double x2;
            x1=x2=-b/(2*a);

            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        }
        else {
            double x1;
            double x2;
            System.out.println("x1=");
            System.out.println("x2=");
        }



        //PUT YOUR CODE HERE
    }
}
