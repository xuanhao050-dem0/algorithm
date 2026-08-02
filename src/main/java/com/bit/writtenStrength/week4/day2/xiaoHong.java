package com.bit.writtenStrength.week4.day2;

import java.util.Scanner;

public class xiaoHong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int h = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            long count=0l;
            while(h>0&&k>0){
                count+=a+b;
                h-=b;
                k-=a;
                if(h<=0&&k<=0)
                    break;
                else if(h<=0)
                    count+=10*b;
                else if(k<=0)
                    count+=10*a;
            }
            System.out.println(count);
        }
    }
}
