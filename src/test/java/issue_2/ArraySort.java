package issue_2;

/**
 * Created by Andrey on 25.02.2017.
 */
public class ArraySort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        for(int i = 1; i < length; i++)
        {
            for(int j = i; (j >= 1) && (array[j] < array[j - 1]); j--)
            //ПОКА (arr[j] меньше arr[j-1]) И (в массиве еще есть элементы (j >= 0))
            {
                int a = array[j];
                array[j] = array[j-1];
                array[j-1] = a;
            }
        }

        //PUT YOUR CODE HERE


        //PUT YOUR CODE HERE

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
//Правильно