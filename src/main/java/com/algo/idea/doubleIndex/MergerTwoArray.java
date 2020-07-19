package com.algo.idea.doubleIndex;

/**
 * 合并两个有序的数组
 *  思路：1.先将两个数组进行合并，再进行sort排序
 *       2.双指针，从前往后进行传递，判断那个小，那个先进一个新的数组，缺点需要先将原来的数据copy出来，空间复杂度高
 *       3.双指针，从后往前进行遍历，没有了空间复杂度
 * */
public class MergerTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merger(nums1,m,nums2,n);
    }

    public static void merger(int[] nums1,int m,int[] nums2,int n){
        int index1 = m-1;
        int index2 = n - 1;
        int mergerIndex = m+n-1;
        while (index1 >=0 & index2 >=0){
            int firstArrNum = nums1[index1];
            int secondArrNum = nums2[index2];
            if(firstArrNum > secondArrNum){
                nums1[mergerIndex] = firstArrNum;
                index1 --;
                mergerIndex --;
            }
            if(firstArrNum <= secondArrNum){
                nums1[mergerIndex] = secondArrNum;
                index2 --;
                mergerIndex --;
            }
        }

        // 对数组遍历
        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
