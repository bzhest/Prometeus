package issue_2;


import java.util.Arrays;

public class MatrixPrint {
    public static void main(String args[]) {
        int anArray[][] = new int[5][5];
        int count = 0;

        for (int i = 0; i < 5; i++)  {
            for (int j = 0; j<5; j++){
                anArray[i][j] = count+1;
                    if(anArray[i][j] == 1 ||anArray[i][j] == 5 ||anArray[i][j] == 7 ||anArray[i][j] == 9 ||anArray[i][j] == 13 ||anArray[i][j] == 17 ||anArray[i][j] == 19 ||anArray[i][j] == 21 ||anArray[i][j] == 25){
                        System.out.print(" " + "*" + " ");

                    }else if(anArray[i][j] == 10||anArray[i][j] == 11||anArray[i][j] == 12||anArray[i][j] == 14||anArray[i][j] == 15||anArray[i][j] == 16||anArray[i][j] == 18||anArray[i][j] == 20||anArray[i][j] == 22||anArray[i][j] == 23||anArray[i][j] == 24){
                        System.out.print(anArray[i][j] + " ");

                    }
                    else {
                        System.out.print(" " + anArray[i][j] + " ");
                    }
                count++;
            }
            System.out.println();

        }

    }
}

/**
 *  2  3  4  *
 6  *  8  * 10
 11 12  * 14 15
 16  * 18  * 20
 * 22 23 24  *
 */