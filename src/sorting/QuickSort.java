package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 4, 2, 7, 1, 8, 9, 6};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end <= start) return;

        int pivotPos = partition(array, start, end);

        quickSort(array, start, pivotPos-1); // left partition
        quickSort(array, pivotPos+1, end); // right partition
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start-1;
        for (int j = start; j < end; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        /**
         * swap with pivot
          */
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}