package org.example.three.twoSum;

public class Solution {
    /**
     * 暴力
     */
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i!=j&&i<j){
                    if ((numbers[i] + numbers[j]) == target) {
                        result[0] = i+1;
                        result[1] = j+1;
                        return result;
                    }
                }
            }
        }
        return result;
    }
    /**
     * 有序+二分查找
     */
    public int[] twoSum2(int[] numbers, int target) {
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            //二分查找
            int j = searchIndex(i+1,numbers,(target-numbers[i]));
            if(j!= -1){
                result[0] = i+1;
                result[1] = j+1;
                return result;
            }
        }

        return result;
    }

    private int searchIndex(int i, int[] numbers, int value) {

        int left = i;
        int right = numbers.length - 1;

        while (left <= right){
            int mid = left+(right-left)/2;
            if (numbers[mid] == value){
                return mid;
            } else if (numbers[mid] > value) {
                right = mid-1;
            }else {
                left = mid+1;
            }
        }


        return -1;
    }
    /**
     * 对撞指针
     */
    public int[] twoSum3(int[] numbers, int target) {

        int[] result = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while (left<right){
            if ((numbers[left]+numbers[right])==target){
                result[0] = left+1;
                result[1] = right+1;
                return result;
            } else if ((numbers[left]+numbers[right])>target) {
                right--;
            }else {
                left++;
            }
        }
        return result;
    }

    /**
     * numbers = [2,7,11,15], target = 9
     * 输出：[1,2]
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers ={2,7,11,15};
        Solution solution = new Solution();
        int[] result = solution.twoSum3(numbers, 9);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+",");
        }
    }
}