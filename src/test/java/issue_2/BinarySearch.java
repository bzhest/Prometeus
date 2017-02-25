package issue_2;

/**
 * Created by Andrey on 25.02.2017.
 */
public class BinarySearch {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 60;
        int count = 0;
        for (int i = 0; i<data.length; i++){
            if (data[i]==numberToFind){
                System.out.println(count);

            }else{
                count++;
            }
        }
        if (count == data.length){
            System.out.println(-1);
        }
    }
}
//Правильно