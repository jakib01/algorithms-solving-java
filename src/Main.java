import sorting.BubbleSorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] data = {-2, 45, 0, 11, -9};
        System.out.print("Data to be sorted:-> ");
        System.out.println(Arrays.toString(data));

        // Bubble sort
        BubbleSorting obj = new BubbleSorting();
        obj.bubbleSort(data);
    }
}