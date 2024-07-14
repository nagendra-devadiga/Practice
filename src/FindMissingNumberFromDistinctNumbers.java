class FindMissingNumberFromDistinctNumbers {
    public static void main(String[] a) {
        int[] array = {1, 2, 3, 5, 6};
        int len = array.length + 1;
        int sum = len * (len + 1) / 2;
        for (int s : array) {
            sum = sum - s;
        }
        System.out.println(sum);
    }
}