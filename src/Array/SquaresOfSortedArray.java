package Array;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{-4, -3, 0, 4, 6, 10};

        int i = 0;
        int j = arr.length-1;

        int[] result = new int[arr.length];
        for (int k = arr.length-1; k >= 0; k--) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                result[k] = arr[i] * arr[i];
                i++;
            } else {
                result[k] = arr[j] * arr[j];
                j--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
