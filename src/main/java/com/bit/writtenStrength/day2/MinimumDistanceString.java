package com.bit.writtenStrength.day2;

import java.util.Objects;
import java.util.Scanner;

public class MinimumDistanceString {
    public static void main(String[] args) {
        //读取数据
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            String str1=scanner.next();
            String str2=scanner.next();
            String[] strs=new String[n];
            for (int i = 0; i < strs.length; i++) {
                strs[i]=scanner.nextLine();
            }
            /**
             * 遍历整个字符串数组，记录每个str1，str2的位置，贪心
             */
            int location1=-1;
            int location2=-1;

            //初始化location
            while(location1==-1) {
                for (int i = 0; i < strs.length; i++) {
                    if (Objects.equals(str1, strs[i]))
                        location1 = i;
                }
            }

            while(location2==-1) {
                for (int i = 0; i < strs.length; i++) {
                    if (Objects.equals(str2, strs[i]))
                        location2 = i;
                }
            }


            int destination=Math.abs(location1-location2);
            for (int i = 0; i < strs.length; i++) {

                if (Objects.equals(str1, strs[i]) && Math.abs(location1-i)<destination){
                    location1=i;
                } else if (Objects.equals(str2, strs[i]) && Math.abs(location2-i)<destination) {
                    location2 = i;
                }

                destination=Math.abs(location1-location2);
            }
            System.out.println(destination);
        }
    }
}

