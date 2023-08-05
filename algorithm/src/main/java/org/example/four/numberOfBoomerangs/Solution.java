package org.example.four.numberOfBoomerangs;

import java.util.HashMap;

public class Solution {

    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            HashMap<Integer,Integer> record = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i!=j){
                   Integer len = dis(points[i],points[j]);
                   if (record.containsKey(len)){
                       record.put(len,record.get(len)+1);
                   }else {
                       record.put(len,1);
                   }
                }
            }
            for(Integer dis: record.keySet())
                res += record.get(dis) * (record.get(dis) - 1);
        }
        return res;
    }

    private int dis(int[] pa, int pb[]){
        return (pa[0] - pb[0]) * (pa[0] - pb[0]) +
                (pa[1] - pb[1]) * (pa[1] - pb[1]);
    }

    public static void main(String[] args) {
        int[][] points = {{0,0},{1,0},{2,0}};
        System.out.println(new Solution().numberOfBoomerangs(points));
    }
}
