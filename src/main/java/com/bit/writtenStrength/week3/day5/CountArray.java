package com.bit.writtenStrength.week3.day5;

import java.util.Scanner;

//通过50%
//二维数组处理 输入输出
//数据过大超时
public class CountArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();//a行
            int b = in.nextInt();//b列
            int[][] arr=new int[a][b];
            int[][] arr1=new int[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr[i][j]= in.nextInt();
                }

            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    for (int k = 0; k < b; k++) {
                        arr1[i][j]+=arr[i][k];
                    }
                    for (int k = 0; k < a; k++) {
                        arr1[i][j]+=arr[k][j];
                    }
                    //自己重复，减去自己
                    arr1[i][j]-=arr[i][j];
                }
            }

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(arr1[i][j]);
                    System.out.print(" ");

                }
                System.out.println();

            }
        }



    }
}
