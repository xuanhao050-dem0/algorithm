package com.bit.writtenStrength.week2.day6;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            String str= in.next();
            int s=0,h=0,y=0;
            for (int i = 0; i <= str.length()-1; i++) {
                if (str.charAt(i)=='s')
                    s++;
                else if (str.charAt(i)=='h')
                    h++;
                else if (str.charAt(i)=='y')
                    y++;


            }
            System.out.println(s*h*y);

        }
    }
}
