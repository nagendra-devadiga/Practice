package permutation_combination;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5};

        int start = 0;
        ArrayList res = new ArrayList<>();
        ArrayList permutation = new ArrayList<>();
        getPermutations(arr, start, permutation, res);
        System.out.println(res);
    }

    public static void getPermutations(int[] array, int start, ArrayList permutation, ArrayList res) {
        res.add(new ArrayList<>(permutation));
        for (int i = start; i < array.length; i++) {
            permutation.add(array[i]);
            getPermutations(array, i+1, permutation, res);
            permutation.remove(permutation.size()-1);
        }
    }

}