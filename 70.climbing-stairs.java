/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }

        int previous = 1;
        int current = 2;
        for(int i = 3; i <= n; i++){
            int total = previous + current;
            previous = current;
            current = total;
        }
        return current; 
    }
}
// @lc code=end
// time O(n)
// space O(1)

