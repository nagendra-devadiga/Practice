package recursion;

import java.util.ArrayList;

public class MinimumCoin {

    public static void main(String[] args) {
        int[] coins = new int[] {1, 4, 5};

        int totalSum = 13;

        ArrayList result = new ArrayList();
        minimumCoins(coins, totalSum, result);
    }

    private static void minimumCoins(int[] coins, int totalSum, ArrayList result) {
        if(totalSum == 0)
            return;

        for (int i = 0; i < coins.length; i++) {
            totalSum = totalSum - coins[i];
            System.out.println(totalSum);
            minimumCoins(coins, totalSum, result);
        }
    }

}
