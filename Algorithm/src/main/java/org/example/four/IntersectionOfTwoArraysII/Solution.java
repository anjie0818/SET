package org.example.four.IntersectionOfTwoArraysII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> record = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (record.containsKey(nums1[i])){
                record.put(nums1[i],record.get(nums1[i])+1);
            }else {
                record.put(nums1[i],1);
            }
        }
        List<Integer> result = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (record.containsKey(nums2[i])&&record.get(nums2[i])>0){
                result.add(nums2[i]);
                record.put(nums2[i],record.get(nums2[i])-1);
            }
        }
        int[] resArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArr[i]= result.get(i);
        }
        return resArr;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        Solution solution = new Solution();
        for (Integer integer : solution.intersect(nums1, nums2)) {
            System.out.println(integer);
        }
    }
}
