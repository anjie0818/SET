package org.example.egiht.permutations;

import java.util.*;

/**
 *  # 46
 *
 *  例如：47 todo
 *
 *  输入：nums = [1,2,3]
 *  输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */
public class Solution2 {

    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> results = new ArrayList<>();
        boolean[] used = new boolean[len];
        Deque<Integer> path = new ArrayDeque();

        dfs(nums,len,used,path,results);

      return results;
    }

    private void dfs(int[] nums, int len, boolean[] used, Deque<Integer> path, List<List<Integer>> results) {

        if (path.size()==len){
            results.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]){
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums,len,used,path,results);
            used[i] = false;
            path.removeLast();
        }

    }


}
