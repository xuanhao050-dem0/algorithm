package com.bit.writtenStrength.week4.day3;

import java.util.Scanner;

public class TheArrayListSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            int[] arr=new int[100000];
            int[] arr1=new int[a];
            int[] arr2=new int[b];
            for (int i = 0; i < a; i++) {
                arr1[i]= in.nextInt();
            }for (int i = 0; i < b; i++) {
                arr2[i]= in.nextInt();
            }

            for (int i = 0; i < a; i++) {

                arr[arr1[i]]++;
            }for (int i = 0; i < b; i++) {

                arr[arr2[i]]++;
            }

            for (int i = 0; i < 100000; i++) {
                if (arr[i]!=0){
                    System.out.print(i);
                    System.out.print(" ");
                }

            }



        }
    }
}
