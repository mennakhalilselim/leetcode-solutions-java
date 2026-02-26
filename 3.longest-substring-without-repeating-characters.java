/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start

import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        if(s.length() == 1){
            return 1;
        }

        int left = 0;
        int right = 0;
        int answer = 0;
        Set<Character> set = new HashSet<>();

        while(right < s.length()){
            char c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            answer = Math.max(answer, right - left + 1);
            right++;
        }

        return answer;
    }
}
// @lc code=end
// time O(n)

