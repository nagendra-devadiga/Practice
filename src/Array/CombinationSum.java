package Array;

import java.util.ArrayList;

public class CombinationSum {
    public static void main(String[] args) {
        int targetSum = 8;
        int[] array = new int[]{2, 3, 5};

        /**
         *  [3, 5]
         *  [2, 2, 2, 2]
         *  [2, 3, 3]
         */


        combination(array, 0, 0, new ArrayList<>(), targetSum);

    }

    private static void combination(int[] array, int curIndex, int curSum, ArrayList curCombination, int targetSum) {

        ArrayList result = new ArrayList();

        if(curSum == targetSum) {
            result.addAll(curCombination);
            return;
        }

        if(curSum > targetSum) {
            curCombination.clear();
            result.clear();
            return;
        }

        System.out.println(curCombination);
        for (int i = curIndex; i < array.length; i++) {
            curCombination.add(array[i]);
            combination(array, i, curSum+array[i], curCombination, targetSum);
        }
        System.out.println(result);
    }
}
