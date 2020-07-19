package com.algo.idea.doubleIndex;

/**
 *
 * 求两个数的平方和
 *  判断一个非负整数是否为两个整数的平方和
 *
 * */
public class TwoNumSqrt {
    public static void main(String[] args) {
        // 在0-target之间查找两个数
        int target= 10;
    }

    public static int[] findTwoNumSqrtSum(int targetNum){
        int[] arr = new int[targetNum];
        for (int i = 0; i < targetNum ; i++) {
            arr[i]=i+1;
        }

        int i =0;
        int j=targetNum - 1;
        while (i < j){
            int sqrtSum = arr[i] * arr[i] + arr[j] * arr[j];
            if(sqrtSum == targetNum){
                return new int[]{arr[i],arr[j]};
            }
            if(sqrtSum > targetNum){
                j--;
            }
            if(sqrtSum < targetNum){
                i++;
            }
        }
        return null;
    }
}
