import sorting.BubbleSorting;
import sorting.SelectionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] data = {-2, 45, 0, 11, -9};
        System.out.print("Data to be sorted:-> ");
        System.out.println(Arrays.toString(data));

        // Bubble sort
        BubbleSorting blbObj = new BubbleSorting();
        blbObj.bubbleSort(data);

        // Selection sort
        SelectionSort selObj = new SelectionSort();
        selObj.selectionSort(data);
    }
}