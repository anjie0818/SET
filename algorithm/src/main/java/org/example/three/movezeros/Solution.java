package org.example.three.movezeros;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public void moveZeroes(int[] nums) {

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                al.add(nums[i]);
            }
        }
        for (int i = 0; i < al.size(); i++) {
            nums[i]=al.get(i);
        }
        for (int i = al.size(); i < nums.length; i++) {
            nums[i]= 0;
        }

    }
    public void moveZeroes2(int[] nums) {

        int k = 0; //保障 [0,k)为非零元素
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                int tmp = nums[k];
                nums[k] = nums[i];
                nums[i] = tmp;
                k++;
            }
        }
    }
}