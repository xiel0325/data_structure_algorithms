package com.algo.idea.doubleIndex;


import java.util.HashMap;

/**
 *
 * 在有序数组中找到两个数，使得他们的和为target
 *
 * */
public class TwoNumsSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target  = 9;
        int[] twoNumsDouble = getTwoNumsDouble(arr, target);
        for (int i : twoNumsDouble) {
            System.out.println(i);
        }
    }

    /**
     * 思路：
     * 1。遍历一次，判断target - arr[i]是否在数组中
     * */
    public static int getTwoNums(int[] arr,int target){
        HashMap<Integer,Boolean> hashMap = new HashMap();
        for (int i : arr) {
            hashMap.put(i,true);
        }
        for (int i : arr) {
            int otherNum = target - i;
            if(hashMap.containsKey(otherNum)){
                // 存在两个数
            }
            return i;
        }
        return -1;
    }

    /**
     * 使用双指针
     *
     * */
    public static int[] getTwoNumsDouble(int[] arr,int target){
        if(arr == null){
            return null;
        }
        int i=0;
        int j = arr.length -1;
        while (i < j){
            int sum = arr[i] + arr[j];
            if(sum > target){
                j--;
            }
            if(sum < target){
                i++;
            }
            if(sum==target){
                return new int[]{i,j};
            }
        }
        return null;
    }
}
