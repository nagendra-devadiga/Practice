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

        merge(arr, start, mid, end);

        System.out.println(Arrays.toString(arr));
    }

    private static int[] merge(int[] arr, int start, int mid, int end) {
        if (start >= end)
            return arr;
        System.out.print(start+ " "+ end + "\n");
        int[] toBe = new int[start + end];

        int i = start;
        int j = mid;
        int k = 0;
        while (i < start && j < end) {
            if(arr[i] < arr[j]) {
                toBe[k++] = arr[i];
                i++;
            } else if (arr[i] > arr[j]) {
                toBe[k++] = arr[j];
                j++;
            }
        }
        while (i < start) {
            toBe[k++] = arr[i++];
        }
        while (j < end) {
            toBe[k++] = arr[j++];
        }
        return toBe;
    }
}
