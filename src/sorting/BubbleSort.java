package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int j = 0;
            while (j < array.length - i -1) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                j++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {10, 3, 2, 4, 6, 7};

        System.out.println(Arrays.toString(bubbleSort(array)));
    }
}
