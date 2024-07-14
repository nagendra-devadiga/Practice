package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        reverseSameArray(arr);
        System.out.println(Arrays.toString(arr));

//        int[] r1 = reverseWithExtraArray(arr);
//        System.out.println(Arrays.toString(r1));
    }

    private static void reverseSameArray(int[] arr) {
        int i = 0;
        int j = arr.length-1;

        while (i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    private static int[] reverseWithExtraArray(int[] arr) {
        int len = arr.length;
        int[] reversed = new int[len];
        for (int i = len-1; i >= 0; i--) {
            reversed[len - i - 1] = arr[i];
        }
        return reversed;
    }
}