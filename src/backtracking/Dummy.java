package backtracking;

public class Dummy {


    public static void main(String[] args) {
        int[] array = new int[]{1, 4};
        callRecursion(array);
    }

    private static void callRecursion(int[] array) {
        int index = 0;
        recursion(array, index);
    }

    private static void recursion(int[] array, int index) {
        for (int track = index; track < array.length; track++) {
            System.out.println("index: "+ index + " track: "+ track);
            recursion(array, track+1);
        }

//        int track = index;
//        while (track < array.length) {
//            System.out.println("index: "+ index + " track: "+ track);
//            track++;
//            recursion(array, track);
//        }

    }
}
