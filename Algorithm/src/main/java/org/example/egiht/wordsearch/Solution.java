package org.example.egiht.wordsearch;

/**
 *   # 79
 */
public class Solution {
    int row;
    int col;
    int[][] move = {{0,1},{1,0},{0,-1},{-1,0}};

    public boolean exist(char[][] board, String word) {
        row =board.length;
        col =board[0].length;
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                System.out.println("开始位置：x："+x+" y："+y);
                boolean[][] used = new boolean[row][col];
                if (dfs(board,word,x,y,0,used)){
                   return true;
               }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board,String word, int x, int y, int location,boolean[][] used) {
        if (word.length()==location+1){
            return word.charAt(location)==board[x][y];
        }
        if (word.charAt(location)!=board[x][y]){
            return false;
        }
        used[x][y] = true; //标记一个元素为使用
        //开始位移 四个方向
        for (int i = 0; i < move.length; i++) {
            int newX = x+move[i][0];
            int newY = y+move[i][1];
            if (isInRange(newX,newY)&&!used[newX][newY]
                    &&dfs(board,word,newX,newY,location+1,used)){
                return true;
            }
        }
        used[x][y] = false; //回溯重置

        return false;
    }
    private boolean isInRange(int i, int j){
        return i >= 0 && j >= 0 && i < row && j < col;
    }
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','E','S'},
                {'A','D','E','E'}
        };
        String word = "AC";
        Solution solution = new Solution();
        System.out.println(solution.exist(board,word));
    }

}
