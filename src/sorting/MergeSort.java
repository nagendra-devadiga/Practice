package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array) {
        int len = array.length;
        if(len <= 1) return;
        int mid = len/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[len - mid];

        int i = 0;
        int j = 0;
        while (i < len) {
            if(i<mid){
                leftArr[i]= array[i];
            } else {
                rightArr[j]= array[i];
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(leftArr) + " " + Arrays.toString(rightArr));
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, leftArr.length, rightArr, rightArr.length, array);
    }

    private static void merge(int[] leftArr, int m, int[] rightArr, int n, int[] array) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j< n) {
            if(leftArr[i] < rightArr[j])
                array[k++] = leftArr[i++];
            else
                array[k++] = rightArr[j++];
        }

        while (i < m) {
            array[k++] = leftArr[i++];
        }
        while (j < n) {
            array[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {
        mergeSort(new int[]{1, 5, 6, 2, 4, 8, 7, 3});
    }
}
