package org.example.three.lengthOfLongestSubstring;

import static java.lang.Math.max;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[256];
        int i = 0;
        int j = -1;
        int result = 0;

        while (i<s.length()){
            if (j+1<s.length()&&freq[s.charAt(j+1)]==0){
                freq[s.charAt(++j)]++;
            }else { //j已经到头 || freq[s[j+1]] == 1
                freq[s.charAt(i++)]--;
            }
            result = max(j-i+1,result);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}