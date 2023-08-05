package org.example.egiht.nqueens;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solveNQueens(4));
    }

    Set<Integer> colSet = new HashSet();
    Set<Integer> dig1 = new HashSet<>();
    Set<Integer> dig2 = new HashSet<>();
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {

        LinkedList<Integer> cols = new LinkedList<>();
        dfs(n, 0, cols);
        return result;
    }

    private void dfs(int n, int rowIndex, LinkedList<Integer> path) {

        if (path.size() == n) {

            result.add(covertPath(path));
            return;
        }
        //遍历第rowIndex行，每一列的元素
        for (int i = 0; i < n; i++) {
            if (!colSet.contains(i) && //不同列
                    !dig1.contains(i + rowIndex) && //不同对角线1
                    !dig2.contains(i - rowIndex) //不同对角线2
            ) {
                colSet.add(i);
                dig1.add(i + rowIndex);
                dig2.add(i - rowIndex);
                path.addLast(i);
                dfs(n, rowIndex + 1, path);
                path.removeLast();
                colSet.remove(i);
                dig1.remove(i + rowIndex);
                dig2.remove(i - rowIndex);
            }

        }
    }

    private List<String> covertPath(LinkedList<Integer> path) {
        int n = path.size();
        List<String> board = new ArrayList<>();
        for (Integer num : path) {
            StringBuilder row = new StringBuilder();
            row.append(".".repeat(Math.max(0, n)));
            row.replace(num, num + 1, "Q");
            board.add(row.toString());
        }
        return board;
    }
}



