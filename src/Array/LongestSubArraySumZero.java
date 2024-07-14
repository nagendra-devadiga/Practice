package Array;

import java.util.*;

public class LongestSubArraySumZero {
    public static void main(String[] args) {

        int[] array = {-1, -2, -3, 1, 2, 0, 4, 5, -1, 1};
        int targetSum = 0;

        System.out.println(Arrays.toString(getSubArray(array, targetSum)));


    }

    private static int[] getSubArray(int[] array, int targetSum) {
        // starting index as key and length of sub-array as value
        HashMap<Integer, Integer> subArrayMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {

            int sum = 0;
            int lastIndexToHoldSumZero = i;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if(sum == targetSum) {
                    lastIndexToHoldSumZero = j;
                }
            }
            if(i != lastIndexToHoldSumZero) {
                subArrayMap.put(i, lastIndexToHoldSumZero-i+1);
            }

        }
        Optional<Map.Entry<Integer, Integer>> max = subArrayMap.entrySet().stream().max(Map.Entry.comparingByValue());

        max.ifPresent(ele -> {
            int[] subArray = Arrays.copyOfRange(array, ele.getKey(), ele.getValue() + ele.getKey());
            System.out.println(Arrays.toString(subArray));
        });
        return new int[]{};
    }


}
