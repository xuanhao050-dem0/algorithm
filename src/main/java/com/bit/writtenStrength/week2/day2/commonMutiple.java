package week2.day2;

import java.util.Scanner;

/**
 * 相乘
 * 每次除2递减xx
 */
public class commonMutiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int b = in.nextInt();
            int c=a*b;
            int d=c;
            int ret=d/2;
            while(true){

                if(ret%a!=0||ret%b!=0){
                    System.out.print(d);
                    return;
                }else{
                    d=ret;
                    ret/=2;
                }


            }
        }
    }
}
