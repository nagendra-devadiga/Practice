package sorting;

import java.util.Arrays;

public class MergeSorting {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 4, 3, 2, 1};

        int start = 0;
        int end = arr.length;
        mergeSorting(arr, start, end);

        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSorting(int[] arr, int start, int end) {
        if(end-start == 1)
            return;

        int mid = (start + end)/2;
        mergeSorting(arr, start, mid); // for left array
        mergeSorting(arr, mid, end); // for right array

        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {

        System.out.print("left array"+ Arrays.toString(Arrays.copyOfRange(arr, start, mid)) + "\n");
        System.out.print("right array"+ Arrays.toString(Arrays.copyOfRange(arr, mid, end)) + "\n");
        System.out.println();
        int[] toBe = new int[end - start]; // len of new array should be (end - start)

        int i = start; // start index of left array i.e Arrays.copyOfRange(arr, start, mid)
        int j = mid; // start index of right array i.e Arrays.copyOfRange(arr, mid, end)
        int k = 0;
        while (i < mid && j < end) {
            if(arr[i] < arr[j]) {
                toBe[k++] = arr[i++];
            } else  {
                toBe[k++] = arr[j++];
            }
        }
        while (i < mid) {
            toBe[k++] = arr[i++];
        }
        while (j < end) {
            toBe[k++] = arr[j++];
        }

        for (int l = 0; l < toBe.length; l++) {
            arr[start+l] = toBe[l]; // increment along with start
        }
    }
}
