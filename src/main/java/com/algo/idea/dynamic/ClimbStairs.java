package com.algo.idea.dynamic;
/**
 *
 * 动态规划算法：
 *  和递归是类似的，但是递归是自顶往下的，动态规划是自下往上
 *  其核心的区别是：递归是不记录中间的结果，动态规划是记录中间的结果
 *
 * */

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }

    public static int climbStairs(int n){
//        if( n<=2){
//            return n;
//        }
        int p=0;
        int q=0;
        int r=1;
        for (int i = 1; i <= n; i++) {
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
