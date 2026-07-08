package com.bit.writtenStrength.day3;


import java.util.ArrayList;
import java.util.Scanner;

public class minimumSums2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            ArrayList<Integer> arrayList=new ArrayList<>();
            //int[] array=new int[a];
            for(int i=0;i< a;i++){
                arrayList.add(i,in.nextInt());
            }
            arrayList.sort(null);
            while(b>0){
                for (int i = a-1; i >=0 ; i--) {
                    if (arrayList.get(i)%2==0){
                        arrayList.set(i,arrayList.get(i)/2);
                        break;
                    }


                }
                b--;
                arrayList.sort(null);
            }
            int sum=0;
            for (int i = 0; i <a; i++) {
                sum+=arrayList.get(i);
            }

            System.out.println(sum);
        }
    }
}
