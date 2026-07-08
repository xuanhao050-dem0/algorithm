package com.bit.writtenStrength.day2;

import java.util.Scanner;

public class MinimumCostClimbDP4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int[] cost=new int[n];
            int[] pay=new int[n+1];
            for(int i=0;i<n;i++){
                cost[i]=in.nextInt();
            }
            pay[0]=0;
            pay[1]=0;
            for(int i=2;i<=n;i++){
                pay[i]=
                        (cost[i-2]+pay[i-2]) > (cost[i-1]+pay[i-1])
                                ? cost[i-1]+pay[i-1] : cost[i-2]+pay[i-2];
            }

            if(n==1){
                System.out.println(cost[0]);
            }else{
                System.out.println(pay[n]);
            }

        }
    }
}
