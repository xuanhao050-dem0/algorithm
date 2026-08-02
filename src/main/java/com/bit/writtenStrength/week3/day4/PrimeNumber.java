package com.bit.writtenStrength.week3.day4;

import java.util.ArrayList;
import java.util.Scanner;

//找质数/合数的方法
public class PrimeNumber {
    //找a到b的质数
    public static ArrayList<Integer> findPrime(int a, int b) {
        ArrayList<Integer> primeNum=new ArrayList<>();
        for (int i = a; i <= b; i++) {
            boolean isTrue=true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){

                    isTrue=false;
                    break;
                }


            }
            if (isTrue){
                primeNum.add(i);
            }
        }
        return primeNum;
    }

    /**
     * 判断每个数是否是神奇数
     * 取每个数，将每个数的部分拆下来
     * 初始化哈希表
     * 遍历质数表
     * 拆每个数
     * 减哈希表
     * 判断如果没有小于零的，成功
     * 不成功，复原下一位，直到最后
     * @param args
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            int count=0;
            ArrayList<Integer> primeNum=findPrime(10,99);
            for (int i = a; i <= b; i++) {
                int[] hashNum=new int[10];
                boolean isTrue=true;
                //初始化哈希表
                int k=i;
                while(k>0){
                    int n=k%10;
                    hashNum[n]++;
                    k/=10;
                }
                //遍历质数表
                for (int j = 0; j < primeNum.size(); j++) {
                    int pri=primeNum.get(j);
                    int pri1= pri%10;
                    int pri2= pri/10;
                    hashNum[pri1]--;
                    hashNum[pri2]--;
                    for (int l = 0; l < hashNum.length; l++) {
                        if (hashNum[l]<0){
                            isTrue=false;
                            hashNum[pri1]--;
                            hashNum[pri2]--;
                        }


                    }
                }

            }
        }

    }
}
