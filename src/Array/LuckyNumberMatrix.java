package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Lucky Numbers in a Matrix Introduction
 * The Lucky Numbers in a Matrix problem asks us to return all lucky numbers in the given matrix. We can easily solve this by initializing an empty list to track lucky numbers and iterating through the matrix, checking if each value satisfies the conditions to become a "lucky number".
 *
 * Lucky Numbers in a Matrix Problem
 * Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
 *
 * A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
 *
 * Example Inputs and Outputs
 * Example 1
 * Input: matrix = [[3, 7, 8], [9, 11, 13], [15, 16, 17]]
 * Output: [15]
 *
 * Example 2
 * Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
 * Output: [12]
 *
 * Example 2
 * Input: matrix = [[7,8],[1,2]]
 * Output: [7]
 */
public class LuckyNumberMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};

        List<Integer> luckyNum = getLuckyNumber(matrix);
        System.out.println(luckyNum);
    }

    private static List<Integer> getLuckyNumber(int[][] matrix) {
        List<Integer> luckyNums = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {

            int minVal = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < minVal){
                    minVal = matrix[i][j];
                    minIndex = j;
                }
            }

            boolean isLucky = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minIndex] > minVal) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                luckyNums.add(minVal);
            }
        }
        return luckyNums;
    }
}
