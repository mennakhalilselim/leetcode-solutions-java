/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int post = 1;
        int pre = 1;
        int numsLength = nums.length;
        int[] answer = new int[numsLength];

        for(int i = 0; i < numsLength; i++) {
            answer[i] = pre;
            pre *= nums[i];
        }

        for(int i = numsLength - 1; i >= 0; i--) {
            answer[i] *= post;
            post *= nums[i];
        }

        return answer;
    }
}
// @lc code=end

