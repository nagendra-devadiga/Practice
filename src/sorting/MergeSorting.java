package sorting;

import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 1, 4, 5};

        int start = 0;
        int end = arr.length -1;
        mergeSorting(arr, start, end);

        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSorting(int[] arr, int start, int end) {
        if(start >= end)
            return;

        int mid = (start + end)/2;
        mergeSorting(arr, start, mid); // for left array
        mergeSorting(arr, mid+1, end); // for right array

        merge(arr, start, end);
    }

    private static void merge(int[] arr, int start, int end) {
        if (start >= end)
            return;
        System.out.print(start+ " "+ end + "\n");
        int[] toBe = new int[start + end];

    }
}
