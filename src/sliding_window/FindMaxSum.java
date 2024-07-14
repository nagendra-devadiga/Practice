package sliding_window;

public class FindMaxSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, -3, 4, 5, -3, 10, 2, -30, 24};
        int k=3;
        maxSum(arr, k);
    }

    private static void maxSum(int[] arr, int k) {
        int maximumSum = 0;
        int position = k;
        for (int i = 0; i < k; i++) {
            maximumSum += arr[i];
        }

        int windowSum = maximumSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i-k];
//            maximumSum = Math.max(maximumSum, windowSum);
            if(windowSum > maximumSum) {
                maximumSum = windowSum;
                position = i;
            }
        }
        System.out.println("maximum sum: "+maximumSum);
        System.out.println("from index "+ (position-k+1) +" to "+ position);
    }
}
