package org.example.three.minSubArrayLen;

import static java.lang.Math.min;

public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        // [i,j]区间内移动
        int i = 0 ;
        int j = -1;
        int result = nums.length + 1;
        int sum = 0;
        while (i<=nums.length-1){
            if (j<nums.length-1&&sum<target){
                sum+=nums[++j];
            }else {
                sum-=nums[i++];
            }
            if (sum>=target){
                result = min(result,j-i+1);
            }
        }
        if (result==nums.length + 1)
            return 0;

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        Solution solution = new Solution();
        System.out.println(solution.minSubArrayLen(7, nums));
    }
}
