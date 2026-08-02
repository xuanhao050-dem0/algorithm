package com.bit.writtenStrength.day3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * int 的范围
 * 整数转字符串
 */
public class AddCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            String num= Integer.toString(a);
            int b=3;
            int i=num.length()-1;
            ArrayList<Character> arr=new ArrayList<>();
            while(i>=0){
                arr.add(num.charAt(i));
                b--;
                if (b==0){
                    arr.add(',');
                    b=3;
                }
                i--;
            }
            //数组转字符串出现很多逗号？？
            //反转字符串的方法
            String s=arr.toString();
            ArrayList<Character> arr1=new ArrayList<>();
            for (int j= s.length()-1;j>=0;j--){
                arr1.add(s.charAt(j));
            }
            System.out.println(arr1);
        }
    }
}
