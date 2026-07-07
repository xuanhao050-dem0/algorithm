package com.bit.simulation;

public class modifyString {
    public String modifyStrings(String s) {
        char ch1='0';
        char ch2='0';

        StringBuilder stringBuilder1=new StringBuilder("abc");
        StringBuilder stringBuilder=new StringBuilder(s);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i)=='?'){
                //边界问题，i是最后一位不用替换ch2，
                if (i+1<stringBuilder.length())
                ch2=stringBuilder.charAt(i+1);
                for (int j = 0; j < stringBuilder1.length(); j++) {
                    if (stringBuilder1.charAt(j)!=ch1 && stringBuilder1.charAt(j)!=ch2)
                       stringBuilder.setCharAt(i,stringBuilder1.charAt(j));
                }
            }
            ch1=stringBuilder.charAt(i);
        }
        s=stringBuilder.toString();
        return s;
    }
}
