/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] amounts = new int[amount + 1];
        Arrays.fill(amounts, amount + 1);

        amounts[0] = 0;
        for(int i = 1; i <= amount; i++){
            for(int j = 0; j < coins.length; j++){
                if(i >= coins[j]){
                    amounts[i] = Math.min(amounts[i], 1 + amounts[i - coins[j]]);
                }
            }
        }

        if(amounts[amount] < amount + 1){
            return amounts[amount];
        }

        return -1;  
    }
}
// @lc code=end
// time: O(n*m), m: number of coins
// space: O(n)

