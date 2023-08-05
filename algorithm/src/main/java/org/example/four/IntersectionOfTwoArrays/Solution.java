package org.example.four.IntersectionOfTwoArrays;

import java.util.HashSet;

public class Solution {
    public int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSetA = new HashSet<>();
        for (int i : nums1) {
            hashSetA.add(new Integer(i));
        }
        HashSet<Integer> hashSetB = new HashSet<>();
        for (int i : nums2) {
            if (hashSetA.contains(i)) {
                hashSetB.add(i);
            }
        }
        int[] result = new int[hashSetB.size()];
        int index = 0;
        for(Integer num: hashSetB)
            result[index++] = num.intValue();
        return result;
    }
    public Integer[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSetA = new HashSet<>();
        for (int i : nums1) {
            hashSetA.add(new Integer(i));
        }
        HashSet<Integer> hashSetB = new HashSet<>();
        for (int i : nums2) {
            if (hashSetA.contains(i)) {
                hashSetB.add(i);
            }
        }
        Integer[] result = new Integer[hashSetB.size()];
        return hashSetB.toArray(result);
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        Solution solution = new Solution();
        for (Integer integer : solution.intersection2(nums1, nums2)) {
            System.out.println(integer);
        }
    }
}
