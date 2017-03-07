package issue_2;

/**
 * Created by SYSTEM on 07.03.2017.
 */
public class Lesson3Item9 {
    public static void main(String[] args) {
    double n = 9;
    double square = Math.sqrt(n);
    int x = (int) square;
        if(Math.pow(square,2) == Math.pow(x,2)) {
        System.out.println(n + " is a perfect square");
    } else {
        System.out.println(n + " is not a perfect square");

    }
    }
}
/*        Determine if the the int variable n is a perfect square and then display an appropriate message.
*/