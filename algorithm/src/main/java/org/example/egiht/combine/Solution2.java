package org.example.egiht.combine;

import java.util.*;

public class Solution2 {

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> results = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque();
        dfs(n,k,1,path,results);
        return results;
    }

    private void dfs(int n, int k, int start, Deque<Integer> path, List<List<Integer>> results) {

        if (path.size()==k){
            results.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n; i++) {

            path.addLast(i);
            dfs(n,k,i+1,path,results);
            path.removeLast();

        }



    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.combine(4,2));
    }
}
