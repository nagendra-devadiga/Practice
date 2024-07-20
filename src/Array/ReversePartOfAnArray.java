package Array;

import java.util.Arrays;

public class ReversePartOfAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        reversePart(arr, 0, 3);
        System.out.println(Arrays.toString(arr));
    }

    public static void reversePart(int[] arr, int start, int end) {
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
