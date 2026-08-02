package com.bit.slidingWindows.maximumSubarray;

import java.util.Arrays;

public class maxSubArray {
    public int maxSubArray1(int[] nums) {
        int[] dp=new int[nums.length+1];
        dp[0]=  0;
        int ret=Integer.MIN_VALUE;
        for (int i = 1; i < dp.length; i++) {
            dp[i]=Math.max(nums[i-1],dp[i-1]+nums[i-1]);
            ret=Math.max(ret,dp[i]);
        }

        return ret;
    }
}
