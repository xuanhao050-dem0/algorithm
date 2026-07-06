package com.bit.doublePointors;

public class MoveZero283 {
    public void moveZeroes(int[] nums) {
        if (nums.length<2){
            System.out.println(nums);
            return;
        }
        int dest=0;
        int cur=1;
        while(cur==nums.length){
            if (nums[cur]==0){
                int swap=nums[dest+1];
                nums[dest+1]=nums[cur];
                nums[cur]=swap;
                dest++;
            }
            cur++;
        }
    }



    public static void main(String[] args) {

    }
}
