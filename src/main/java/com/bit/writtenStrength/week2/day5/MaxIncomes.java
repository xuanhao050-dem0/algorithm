package com.bit.writtenStrength.week2.day5;

import java.util.Scanner;

public class MaxIncomes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n - 1; i++) {
                arr[i]=in.nextInt();
            }
            int count=0,fast=1,slow=0;
            while(fast<=n-1){
                if(arr[fast]>arr[slow] && fast+1<=n-1 && arr[fast+1]<arr[slow]){
                    count+=arr[fast]-arr[slow];
                    slow=fast;
                    fast++;
                } else if (arr[fast]>arr[slow] && fast==n-1) {
                    count+=arr[fast]-arr[slow];
                    
                }
            }
            System.out.println(count);
        }
    }
}
