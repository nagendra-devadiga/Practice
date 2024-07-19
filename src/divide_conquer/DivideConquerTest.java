package divide_conquer;

import java.util.Arrays;

public class DivideConquerTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        divideConquer(arr);
    }

    private static void divideConquer(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        divide(arr, start, end);
    }

    private static void divide(int[] arr, int start, int end) {
        if(start >= end)
            return;
        int mid = (start+end)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
    }
}
