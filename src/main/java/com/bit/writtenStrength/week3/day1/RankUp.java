package com.bit.writtenStrength.week3.day1;

import java.util.Scanner;

/**
 * q1
 */
public class RankUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int T = in.nextInt();
            while(T>0){
                int n=in.nextInt();
                int k= in.nextInt();
                int count=0,win=0;
                String str= in.next();
                for (int i = 0; i < n; i++) {
                    char ch=str.charAt(i);
                    if (ch=='W'&&win>=2){
                        count+=k;
                        win++;
                    } else if (ch=='W'&&win<2) {
                        count++;
                        win++;
                    }else {
                        count--;
                        win=0;
                    }
                }

                System.out.println(count);
                T--;
            }

        }
    }
}
