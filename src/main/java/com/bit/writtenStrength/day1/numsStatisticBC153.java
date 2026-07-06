package com.bit.writtenStrength.day1;
import java.util.Scanner;

public class numsStatisticBC153 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int left=scanner.nextInt();
        int right= scanner.nextInt();
        int count=0;
        for (int i = left; i <=right ; i++) {
            int num=i;
            while(num>1){
                int each=num%10;
                if (each==2)
                    count++;
                num=num/10;
            }
        }
        System.out.println(count);
    }
}

