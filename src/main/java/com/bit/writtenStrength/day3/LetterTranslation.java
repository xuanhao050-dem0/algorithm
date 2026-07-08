package com.bit.writtenStrength.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterTranslation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) {// 注意 while 处理多个 case
            //未确定长度的字符串数组初始化
            ArrayList<String> letterString=new ArrayList<>();
            StringBuilder letter=new StringBuilder();

            while(in.hasNext()){
                letterString.add(in.next());
            }
            for (String string : letterString) {
                letter.append(Character.toUpperCase(string.charAt(0)));
            }
            String s=letter.toString();
            System.out.println(s);
        }
    }
}
