package com.bit.writtenStrength.day1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * stringBuilder数据结构
 * 使用栈来判断每个进来的元素是否相同
 */
public class ClickDeleteAB5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) { // 注意 while 处理多个 case
            String str=scanner.nextLine();
            StringBuilder stack=new StringBuilder();
            for (int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                //相同则出栈
                //防止越界
                if (stack.length()>0&&stack.charAt(stack.length()-1)==ch){
                    stack.deleteCharAt(stack.length()-1);
                }else{
                    stack.append(ch);
                }
            }
            if (stack.length()==0) {
                System.out.println("0"); // 如果全消除光了，输出 0
            } else {
                System.out.println(stack.toString()); // 输出最终形态
            }
        }

    }
}
