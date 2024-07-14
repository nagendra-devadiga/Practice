package Array;

import java.util.Arrays;

public class ReversePartOfAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        reversePart(arr, 0, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static void reversePart(int[] arr, int start, int end) {
        if(start >= end || start >= arr.length)
            return;
        int i = start;
        int j = end;

        while (i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
