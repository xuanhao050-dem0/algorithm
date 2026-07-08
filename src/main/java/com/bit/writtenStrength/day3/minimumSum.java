package com.bit.writtenStrength.day3;

import java.util.Scanner;

public class minimumSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            int[] array=new int[a];
            for(int i=0;i<array.length;i++){
                array[i]=in.nextInt();
            }
            int sum=array[0];
            int left=0;
            int right=0;
            //指针移动+更新区间和
            while(left<=right && right<=a){
                if(sum<b){
                    right++;
                    sum+=array[right];
                }else{
                    left++;
                    sum-=array[left];
                    if(sum<b){
                        left--;
                        sum+=array[left];
                    }
                }


            }
        }
    }
}
