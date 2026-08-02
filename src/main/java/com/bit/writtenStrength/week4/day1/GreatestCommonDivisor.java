package com.bit.writtenStrength.week4.day1;

import java.util.ArrayList;
import java.util.Scanner;

//通过率60%
public class GreatestCommonDivisor {
    public static int gcd(long a,long b){
//        int[] arr1=new int[a];
//        int[] arr2=new int[b];
//        for (int i = 1; i <=a ; i++) {
//            if (a%i==0)
//                arr1[i]++;
//
//        }
//        for (int i = 1; i <=b ; i++) {
//            if (b%i==0)
//                arr2[i]++;
//
//        }
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for (int i = 1; i <=a ; i++) {
            if (a%i==0)
                arr1.add(i);

        }
        for (int i = 1; i <=b ; i++) {
            if (b%i==0)
                arr2.add(i);

        }
        int ret=1;
        for (int i = 0; i < arr2.size(); i++) {
            if (arr1.contains(arr2.get(i)))
                ret=Math.max(ret,arr2.get(i));
        }

        return ret;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            long count = in.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]= in.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                if (count>=arr[i])
                    count+=arr[i];
                else {
                    count+=gcd(Math.max(count,arr[i]),Math.min(count,arr[i]));
                }



            }
            System.out.println(count);
        }
    }
}
