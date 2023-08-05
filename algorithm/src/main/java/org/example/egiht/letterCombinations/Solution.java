package org.example.egiht.letterCombinations;
import java.util.ArrayList;
import java.util.List;

/**
 * 什么是回溯？
 *  回溯法是暴力解法的一个重要手段
 *  回溯法需要进行状态重置
 *         递归前干啥。。
 *         递归出干啥。。
 *
 *  暴力解法：
 *          暴力for循环
 *          回溯法
 *
 *       例如：93 restore ip addresses
 *            131 palindrome partitioning
 */
public class Solution {
    String[] nums={"","","abc","def",
            "ghi","jkl","mno",
            "pqrs","tuv","wxyz"};
    StringBuilder tmp = new StringBuilder();
    ArrayList<String> results = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits==null||digits.length()==0){
            return results;
        }
        backTracking(digits,0);
        return results;
    }

    private void backTracking(String digits, int i) {
        if (digits.length()==tmp.length()){
            results.add(tmp.toString());
            return;
        }
        int n = Integer.parseInt(digits.charAt(i)+"");
        String str = nums[n];
        for (int j = 0; j < str.length(); j++) {
            tmp.append(str.charAt(j));
            backTracking(digits, i+1);
            tmp.deleteCharAt(tmp.length() - 1);//回溯法需要进行状态重置
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result = solution.letterCombinations("345");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
