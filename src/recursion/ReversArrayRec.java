package recursion;

import java.util.Arrays;

public class ReversArrayRec {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr){
        reverseRec(arr, 0, arr.length-1);
    }

    private static void reverseRec(int[] arr, int start, int end) {
        if(start >= end)
            return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseRec(arr, start+1, end-1);
    }
}
