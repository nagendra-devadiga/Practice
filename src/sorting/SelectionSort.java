package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            int j = i+1;
            while (j < array.length -1) {
                if(array[j] < array[min]) {
                    min = array[j];
                }
                int temp = array[j];
                array[i] = array[min];
                array[min] = temp;
                j++;
            }

            System.out.println(min);

        }



        return array;
    }

    public static void main(String[] args) {
        int[] array = {10, 3, 2, 4, 6, 7};

        System.out.println(Arrays.toString(selectionSort(array)));
    }
}
