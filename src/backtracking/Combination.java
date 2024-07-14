package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination {


    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 5};

        List list = combination(array);

        System.out.println(list);

//        combinationWithLoopBinaryMapping(array);

    }

    private static void combinationWithLoopBinaryMapping(int[] array) {
        List res = new ArrayList();
        for (int i = 0; i < Math.pow(2, array.length); i++) {

            List subSet = new ArrayList<>();
            char[] chars = Integer.toBinaryString(i).toCharArray();

            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '1'){
                    subSet.add(array[j]);
                }
            }
            res.add(subSet);
        }
        System.out.println(res);
    }


    private static List combination(int[] array) {
        List res = new ArrayList();
        List subSet = new ArrayList();

        int index = 0;

        calcCombination(array, index, subSet, res);

        return res;
    }

    private static void calcCombination(int[] array, int index, List subSet, List res) {
        res.add(new ArrayList<>(subSet));
        for (int i = index; i < array.length; i++) {
            subSet.add(array[i]);
            calcCombination(array, i+1, subSet, res);
            subSet.remove(subSet.size() - 1);
        }
    }
}
