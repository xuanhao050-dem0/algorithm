package com.bit.writtenStrength.week3.day5;

import java.util.Scanner;

//通过率37.5%
public class EnjoyPeach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int effectiveTime = in.nextInt();
            int left=0,right=0,maxHappy=0,minShame=0,shortDay=0;
            int[] happy=new int[n];
            int[] shame=new int[n];
            for (int i = 0; i < n; i++) {
                happy[i]= in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                shame[i]= in.nextInt();
            }
            int happyValue=happy[0];
            int shameValue=shame[0];

            //初始化窗口
            while(right-left+1<effectiveTime){
                right++;
                happyValue+=happy[right];
                shameValue+=shame[right];
            }
            maxHappy=happyValue;
            minShame=shameValue;

            while(right<n-1){


                right++;
                happyValue+=happy[right];
                shameValue+=shame[right];
                left++;
                happyValue-=happy[left];
                shameValue-=shame[left];
                if (happyValue>maxHappy){
                    maxHappy=happyValue;
                    shortDay=left;
                    minShame=shameValue;
                } else if (happyValue == maxHappy) {
                    if (shameValue<minShame){
                        maxHappy=happyValue;
                        shortDay=left;
                        minShame=shameValue;
                    }
                }
            }
            System.out.println(shortDay+1);
        }
    }
}
