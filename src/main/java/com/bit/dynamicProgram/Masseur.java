package com.bit.dynamicProgram;

//https://leetcode.cn/problems/the-masseuse-lcci/
public class Masseur {
    public int massage(int[] nums) {
        int n= nums.length;
        int[] f=new int[n];
        int[] g=new int[n];
        if (nums.length==0)
            return 0;
        f[0]=nums[0];
        g[0]=0;
        for (int i = 1; i < n; i++) {
            f[i]=g[i-1]+nums[i];
            g[i]=Math.max(g[i-1],f[i-1]);
        }
        return Math.max(f[n-1],g[n-1]);
    }

    public static void main(String[] args) {

    }
}
