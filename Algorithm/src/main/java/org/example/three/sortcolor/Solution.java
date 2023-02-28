package org.example.three.sortcolor;

import java.util.Arrays;
import java.util.Collections;

/**
 * nums = [2,0,2,1,1,0]
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 1, 1, 0};
        Solution s = new Solution();
        s.sortColors2(nums);
    }
    public void sortColors1(int[] nums) {

        int[] col = new int[3];
        //计数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                col[0]++;
            }
            if (nums[i]==1){
                col[1]++;
            }
            if (nums[i]==2){
                col[2]++;
            }
        }
        int index = 0;
        for (int i = 0; i < col[0]; i++) {
            nums[index] = 0;
            index++;
        }
        for (int i = 0; i < col[1]; i++) {
            nums[index] = 1;
            index++;
        }
        for (int i = 0; i < col[2]; i++) {
            nums[index] = 2;
            index++;
        }


    }
    public void sortColors2(int[] nums) {

        int zero = -1;
        int two = nums.length;

        for (int i = 0; i < two;) {
            System.out.println("-------");
            /**
             * 错误写法 三个if
             */
//            if (nums[i]==0){
//                swap(nums, ++zero, i++);
//                System.out.println("000");
//            }
//            if (nums[i]==1){
//                i++;
//                System.out.println("111");
//
//            }
//            if (nums[i]==2){
//                swap(nums, i, --two);
//                System.out.println("222");
//            }
            if(nums[i] == 1)
                i ++;
            else if (nums[i] == 2)
                swap(nums, i, --two);
            else{ // nums[i] == 0
                assert nums[i] == 0;
                swap(nums, ++zero, i++);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+",");
        }
    }
    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i]= nums[j];
        nums[j] = t;
    }
}