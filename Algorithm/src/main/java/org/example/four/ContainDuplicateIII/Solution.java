package org.example.four.ContainDuplicateIII;

import java.util.TreeSet;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        TreeSet<Long> recode =new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (recode.ceiling((long)nums[i]-(long)valueDiff)!=null&&
                    recode.ceiling((long)nums[i]-(long)valueDiff)<=(long)nums[i]+(long)valueDiff){
                return true;
            }
            recode.add((long) nums[i]);
            if (recode.size()==indexDiff+1){
                recode.remove((long)nums[i-indexDiff]);
            }
        }
        return false;
    }
    private static void printBool(boolean b){
        System.out.println(b ? "True" : "False");
    }
    public static void main(String[] args) {

        int[] nums = {-2147483648, -2147483647};
        int k = 3;
        int t = 3;
        printBool((new Solution()).containsNearbyAlmostDuplicate(nums, k, t));
    }
}
