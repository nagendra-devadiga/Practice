package Array;

import java.util.Arrays;
import java.util.Collections;

/**
 * [1,2,3,4,5] and k = 2
 * partition till Kth position (0 to k-1)
 * [1,2,3 | 4, 5]
 * Reverse both partition
 * [3,2,1 | 5,4]
 * Reverse whole
 * [4,5,1,2,3]
 */
public class RotateKthTimePartition {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int k = 2;
        System.out.println("Before rotation: "+ Arrays.toString(arr));
        rotate(arr, k);
        System.out.println("After rotation: "+ Arrays.toString(arr));

//        k = -2;
//        System.out.println("Before rotation: "+ Arrays.toString(arr));
//        rotate(arr, k);
//        System.out.println("After rotation: "+ Arrays.toString(arr));
    }

    private static void rotate(int[] arr, int k) {

        k = k % arr.length;
        if(k < 0){
            k = k+ arr.length;
        }

        ReversePartOfAnArray.reversePart(arr, 0, k-1);

        ReversePartOfAnArray.reversePart(arr, k, arr.length-1);

        ReversePartOfAnArray.reversePart(arr, 0, arr.length-1);
    }
}
