/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
// time O(n^2) + O(nlogn)
// space O(n)

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0){
                    left++;
                }
                if(sum > 0){
                    right--;
                }
                if(sum == 0){
                    answer.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;

                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                }
            }
        }

        return answer;
    }
}
// @lc code=end

