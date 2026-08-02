package com.bit.writtenStrength.week3.day4;

import java.util.ArrayList;

//ArrayList转字符串
//怎么将数组/容器处理好的字符转为字符串  都会转化为[A,A,A]
//toString()不行
//StringBuilder
public class ReplaceString {
    public static String formatString (String str, char[] arg) {
        StringBuilder s=new StringBuilder();
        int i=0,k=0;
        while (i < str.length() ) {
            if (str.charAt(i)!='%'){
                s.append(str.charAt(i));
                i++;
            } else  {
                s.append(arg[k]);
                i+=2;
                k++;

            }
        }
        for (;k< arg.length;k++){
            s.append(arg[k]);
        }


        return s.toString();
    }

    public static void main(String[] args) {
        String string=new String("A%sC%sE");
        char[] chars=new char[3];
        chars[0]='B';
        chars[1]='D';
        chars[2]='F';
        System.out.println(ReplaceString.formatString(string,chars));
    }
}
