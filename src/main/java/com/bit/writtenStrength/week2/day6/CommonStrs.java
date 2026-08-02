package com.bit.writtenStrength.week2.day6;

import java.util.ArrayList;
import java.util.Scanner;

//双重for循环遍历
public class CommonStrs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            StringBuilder sb=new StringBuilder(s1);
            int j=0;
            for (int i = 0; i <= s2.length()-1; i++) {
                while(j<=sb.length()-1){
                    if (sb.charAt(j)==s2.charAt(i))
                        sb.deleteCharAt(j);
                    else{
                        j++;

                    }

                }
                j=0;


            }
            System.out.println(sb);
        }
    }
}
