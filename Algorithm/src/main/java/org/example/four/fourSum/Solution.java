package org.example.four.fourSum;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

        int[] a = {1, 2};
        int[] b = {-2, -1};
        int[] c = {-1, 2};
        int[] d = {0, 2};
        System.out.println((new Solution()).fourSumCount(a, b, c, d));
    }
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        HashMap<Integer,Integer> record = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i]+nums2[j];
                if (record.containsKey(sum)){
                    record.put(sum,record.get(sum)+1);
                }else {
                    record.put(sum,1);
                }
            }
        }
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums4.length; j++) {
                if (record.containsKey(-nums3[i]-nums4[j])){
                    count+=record.get(-nums3[i]-nums4[j]);
                }
            }
        }
        return count;
    }
}
