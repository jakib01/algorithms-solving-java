package sorting;

import java.util.Arrays;

public class SelectionSort {
    public void selectionSort(int[] array){
        var size = array.length;
        for(int i = 0; i < size - 1; i++){
            int min_index = i;
            for(int j = i + 1; j < size; j++){
                if(array[min_index] > array[j]){
                    min_index = j;
                }
            }

            var temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;
        }

        System.out.print("After Bubble Sort Apply:-> ");
        System.out.println(Arrays.toString(array));
    }
}
