public class Main {
    public static void main(String[] args) {
        int[] coins = new int[]{200, 100, 25, 10, 5 };
        int amount = 500;
        int buffer = 10;
        int[] memo = new int[amount + buffer];

        // System.out.println(minCoinChange(coins, 38500)); // THIS WILL NEVER FINISH RUNNING
        System.out.println("Minimum coins required for " + amount + " cents is: " + minCoinChangeMemoized(coins, memo, amount));
    }

    // NOTE: This will not finish as it uses recursion poorly
    /**
     * Recursively determines the minimum number of coins needed to make up the given amount.
     * This version does not use memoization, so it may run extremely slowly for larger values.
     * Example: if coins = {25, 10, 5} and amount = 30,
     * the method returns 2 (25 + 5).
     *
     * @param coins  an array of available coin denominations
     * @param amount the target amount to make change for
     * @return the minimum number of coins required to make up the amount, or Integer.MAX_VALUE if no valid combination exists
     */
    public static int minCoinChange(int[] coins, int amount) {
        if (amount == 0) { return 0; }
        else {
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (coin <= amount) {
                    int coinAmount = 1 + minCoinChange(coins, amount - coin);
                    min = Math.min(min, coinAmount);
                }
            }
            return min;
        }
    }

    /**
     * Recursively determines the minimum number of coins needed to make up the given amount
     * using memoization to avoid redundant calculations. Each sub-problem result is stored in the memo array,
     * where memo[n] represents the minimum number of coins required to make change for the value n. This
     * significantly improves performance compared to the non-memoized version.
     * Example: if coins = {25, 10, 5} and amount = 30,
     * the method returns 2 (25 + 5).
     *
     * @param coins  an array of available coin denominations
     * @param memo   a memoization array used to cache computed results for each amount
     * @param amount the target amount to make change for
     * @return the minimum number of coins required to make up the amount or Integer.MAX_VALUE if no valid combination exists
     */
    public static int minCoinChangeMemoized(int[] coins, int[] memo, int amount) {
        if (amount == 0) { return 0; }
        if (memo[amount] != 0) { return memo[amount]; }
        else {
            int result = Integer.MAX_VALUE;
            for (int coin : coins) {
                if (amount - coin >= 0) {
                    result = Math.min(result, minCoinChangeMemoized(coins, memo, amount - coin) + 1);
                }
            }
            memo[amount] = result;
            return result;
        }
    }
}