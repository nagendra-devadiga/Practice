package permutation_combination;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5};

        getPermutations(arr, 0);

    }

    public static void getPermutations(int[] array, int r) {
        for (int i = r; i < array.length; i++) {
            System.out.println(array[i]);
            getPermutations(array, i+1);
        }
    }

}