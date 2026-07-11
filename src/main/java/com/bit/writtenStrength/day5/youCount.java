package com.bit.writtenStrength.day5;


import java.util.Scanner;

public class youCount {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            while(n>0){
                int a= scanner.nextInt();
                int b= scanner.nextInt();
                int c= scanner.nextInt();
                int max=Math.min(c,Math.min(a,b));

                b-=max;
                if (b==0||b==1){
                    System.out.println(2*max);
                }else {
                    System.out.println(2*max+(b-1));
                }

                n--;
            }
        }
    }
}
