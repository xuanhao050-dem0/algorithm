package com.bit.writtenStrength.week3.day2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

//贪心：排序从第二个取
//ArrayList排序方法
//数据类型表示范围及其表示方法 int long = 0L
public class Competition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            Long count=0L;
            for (int i = 0; i < 3*n; i++) {
                arr.add(in.nextInt());
            }
            arr.sort(Collections.reverseOrder());
//            for (int i = n; i < 2*n; i++) {
//                count+=arr.get(i);
//            }
            int k=n;
            for (int i = 1; i < 3*n; i+=2) {
//                while(n>0){
                if (k<=0)
                    break;
                    count+= arr.get(i);
                    k--;
//                    n--;
//                }
            }

            System.out.println(count);
        }
    }
}
