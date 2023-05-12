package org.example.four.twoSum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> record = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];
            if (record.containsKey(com)){
                int[] res = new int[2];
                res[0]=record.get(com);
                res[1]=i;
                return res;
            }
            record.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }
}