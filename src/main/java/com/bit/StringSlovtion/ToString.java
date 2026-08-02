package com.bit.StringSlovtion;

import java.util.ArrayList;

public class ToString {
    public static void main(String[] args) {
        ArrayList<Character> arrayList=new ArrayList<>();
        arrayList.add('A');
        arrayList.add('A');
        arrayList.add('A');
        char[] chars=new char[9];
        chars[1]='a';
        chars[2]='a';
        chars[3]='a';
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append('A');
        stringBuilder.append('A');
        stringBuilder.append('A');
        stringBuilder.append('A');
        String s=new String(arrayList.toString());
        //System.out.println(arrayList.toString());
        //System.out.println(chars);
        //System.out.println(s);
        System.out.println(stringBuilder);
    }
}
