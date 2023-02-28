package org.example.egiht.numberofIslands;

/**
 * # 200
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(solution.numIslands(grid));
    }
    int[][] move = {{0,1},{1,0},{0,-1},{-1,0}};
    int row = 0;
    int col = 0;
    public int numIslands(char[][] edges) {

        row = edges.length;
        col = edges[0].length;
        boolean[][] used = new boolean[row][col];//染色

        int count = 0;//计数
        for (int i = 0; i <edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                if (edges[i][j]=='1'&&used[i][j]==false){
                    System.out.println("开始位置：y："+i+" x："+j);
                    count++;
                    dfs(edges,i,j,used);
                }
            }

        }
        return count;
    }


    private void dfs(char[][] edges, int y, int x, boolean[][] used) {
        used[y][x]=true;//染色
        //开始扩散
        for (int i = 0; i < move.length; i++) {

            int newY = y+move[i][0];
            int newX = x+move[i][1];
            //新位置在范围内 + 为1陆地 进行扩散
            if (isRange(newY,newX)&&edges[newY][newX]=='1'&&!used[newY][newX]){
                dfs(edges,newY,newX,used);
            }
        }
    }

    private boolean isRange(int newY, int newX) {
        return newY>=0&&row>newY&&newX>=0&&newX<col;
    }


}