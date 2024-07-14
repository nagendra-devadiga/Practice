package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[] {2, 4, 6, 8, 9, 22, 55, 67};
        int target = 22;
        int start = 0;
        int end = array.length-1;
        int at = binarySearch(array, target, start, end);
        System.out.println(at);
    }

    // we will pass start and end cuz we will be using entire array every time
    private static int binarySearch(int[] array, int target, int start, int end) {

        if(start >= end)
            return -1;

        int middle = (start + end)/2;
        if(array[middle] == target)
            return middle;

        if( target > array[middle] ) {
            return binarySearch(array, target, middle+1, end);
        }

        return binarySearch(array, target, start, middle);

    }
}
