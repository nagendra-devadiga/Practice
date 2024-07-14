package Array;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] result = new int[m+n];
            int i = 0;
            int j = 0;
            int k = 0;
            while(i < m && j < n) {
                if(nums1[i] < nums2[j]) {
                    result[k++] = nums1[i++];
                } else {
                    result[k++] = nums2[j++];
                }
            }

            // add left over items
            while (i < m) {
                result[k++] = nums1[i++];
            }

            // add left over items
            while (j < n) {
                result[k++] = nums2[j++];
            }

        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 4, 7}, 5, new int[]{2, 5, 6}, 3);
    }
}
