package com.bit.writtenStrength.week3.day5;

import java.util.Scanner;

//20min
//幂的函数 pow
public class ReviseNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            long n = in.nextInt();
            int count=0;
            int pow1=0;//幂次
            while(n>0){
                long k=n%10;
                if (k%2!=0)
                    count+= (int) Math.pow(10,pow1);
                pow1++;
                n/=10;
            }
            System.out.println(count);
        }
    }
}
