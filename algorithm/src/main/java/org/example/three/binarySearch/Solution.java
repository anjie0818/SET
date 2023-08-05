package org.example.three.binarySearch;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Solution solution = new Solution();
        System.out.println(solution.binarySearch(arr,9));
    }

    private int binarySearch(int[] arr, int target) {

        //定义左右边界[left,right]中寻找
        int left = 0;
        int right = arr.length-1;
        while (left<=right){
            int mid = left+ (right-left)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (arr[mid]<target){
               left = mid+1;
            }
            if (arr[mid]>target){
                right = mid+1;
            }
        }
        return -1;
    }
}
