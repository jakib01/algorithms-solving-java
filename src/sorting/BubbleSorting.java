package sorting;

import java.util.Arrays;

public class BubbleSorting {
    public void bubbleSort(int[] array){
        int size = array.length;

        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size -1 - i; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("After Selection Sort Apply:-> ");
        System.out.println(Arrays.toString(array));
    }
}
