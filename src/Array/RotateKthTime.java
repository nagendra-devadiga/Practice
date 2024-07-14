package Array;

import java.util.Arrays;

public class RotateKthTime {
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
        for (int i = 0; i < k; i++) {
            rotateOneStep(arr);
        }
    }

    private static void rotateOneStep(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

}
