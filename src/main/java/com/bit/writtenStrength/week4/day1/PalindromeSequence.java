package com.bit.writtenStrength.week4.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int t = in.nextInt();
            while(t>0){
                int n= in.nextInt();
                int nn=n;
                boolean isTrue=false;
                ArrayList<String> arr=new ArrayList<>();

                while(nn>0){
                    nn--;
                    arr.add(in.next());
                }
                //int len= arr.size();


                for (int i = 0; i <= (n-1)/2; i++) {
                    int num=n-i-1;
                    int[] arr1=new int[26];
                    for (int j = 0; j < arr.get(i).length(); j++) {
                        arr1[arr.get(i).charAt(j)-'a']++;
                    }
                    int[] arr2=new int[26];
                    for (int j = 0; j < arr.get(num).length(); j++) {
                        arr2[arr.get(num).charAt(j)-'a']++;
                    }
                    for (int k = 0; k < 26; k++) {
                        if (arr1[k]>0&&arr2[k]>0){
                            isTrue=true;
                            break;
                        }

                    }
                }
                System.out.println(isTrue?"Yes":"No");
                t--;
            }

        }
    }
}
