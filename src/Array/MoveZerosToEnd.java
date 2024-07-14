package Array;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] array = {0, 3, 5, 0, 2, 0, 6, 6, 0};

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }

        for (int i: array) {
            System.out.print(i + " ");
        }

    }
}
