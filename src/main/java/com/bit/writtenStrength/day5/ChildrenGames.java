package com.bit.writtenStrength.day5;

import java.util.Arrays;
import java.util.Scanner;

public class ChildrenGames {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int m= scanner.nextInt();
            int[] arr=new int[n];
            Arrays.fill(arr, 1);
            //指针转动，直到剩最后一个孩子
            int current=0;
            int count=0;
            while(true){
                //指针转动

                while(m>0){
                    //判断是否删除 m为指针转动次数
                    if (arr[current]==1){
                        m--;
                        arr[current]=0;
                    }

                    //指针巡回
                    if (current<n-1){
                        current++;
                    }else{
                        current=0;
                    }

                }
                //统计剩下一个1
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i]==1){
                        count+=1;
                    }
                    if (count==1){
                        break;
                    }else {
                        count=0;
                    }

                }

            }

        }
    }
}
