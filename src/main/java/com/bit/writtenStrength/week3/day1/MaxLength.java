package com.bit.writtenStrength.week3.day1;

import java.util.HashSet;

public class MaxLength {
    public static int maxLength (int[] arr) {
        int count=0,maxCount=0;
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            int lastLength= set.size();
            set.add(arr[i]);
            if (set.size()==lastLength){
                if (count>maxCount)
                    maxCount=count;
                count=1;
                set.clear();
            }else{
                count++;
            }


        }



        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,2,6};
        System.out.println(maxLength(arr));
    }
}
