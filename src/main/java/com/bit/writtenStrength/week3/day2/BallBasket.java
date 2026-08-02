package com.bit.writtenStrength.week3.day2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ArrayList的remove方法
 * 想在字符数组删除指定字符
 * 但是传入参数为index arr1.remove(str2.charAt(i));
 *
 * 输入输出next和nextLine的区别
 *
 * 输出一个变量两个结果==》顶一个ret
 */

public class BallBasket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
           String str1=in.next();
           String str2=in.next();
           String ret="Yes";
            ArrayList<Character> arr1=new ArrayList<>();
            for (int i = 0; i < str1.length(); i++) {

                    arr1.add(str1.charAt(i));
            }
            for (int i = 0; i < str2.length(); i++) {
                if (!arr1.contains(str2.charAt(i))){

                    System.out.println("No");
                    ret="No";
                    break;
                }
                arr1.remove(Character.valueOf(str2.charAt(i)));
            }
            if (!ret.equals("No"))
                System.out.println("Yes");
        }
    }
}
