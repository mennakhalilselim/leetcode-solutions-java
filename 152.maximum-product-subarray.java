/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) { 
            int current = nums[i];
            int temp = Math.max(current, Math.max(current * max, current * min));
            min = Math.min(current, Math.min(current * max, current * min));
            max = temp;
            result = Math.max(result, max);
        }
        
        return result;
    }
}
// @lc code=end

