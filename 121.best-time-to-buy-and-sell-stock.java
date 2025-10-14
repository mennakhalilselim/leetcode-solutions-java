/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            profit = Math.max(profit, price - minPrice);
        }

        return profit;
    }
}
// @lc code=end
/*
time complexity: O(n)
space complexity: O(1)
*/

