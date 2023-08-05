package org.example.egiht.permutations;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 *  # 46
 *
 *  例如：47 todo
 */
public class Solution{

    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> results = new ArrayList<>();
        boolean[] used = new boolean[len];
        if (nums==null||len ==0){
            return results;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums,len,0,path,used,results);
        return results;
    }

    private void dfs(int[] nums, int len, int index, Deque<Integer> path, boolean[] used, List<List<Integer>> results) {

        if (len ==path.size()){
            results.add(new ArrayList<>(path));
        }
        for (int j = 0; j < len; j++) {

            if (used[j]){
                continue;
            }
            path.addLast(nums[j]);
            used[j] = true;
            dfs(nums,len,index+1,path,used,results);
            path.removeLast();
            used[j] = false;
        }
    }



}
