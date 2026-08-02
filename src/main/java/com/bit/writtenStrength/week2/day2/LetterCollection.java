package week2.day2;

import java.util.Scanner;

public class LetterCollection {
    public static int score(int a,int b,char[][] chars){
        if (chars[a][b]=='l')return 4;
        else if (chars[a][b]=='o')return 3;
        else if (chars[a][b]=='v')return 2;
        else if (chars[a][b]=='e')return 1;
        else return 0;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int m = in.nextInt();
            char[][] chars=new char[n][m];
            //初始化字符数组
            for (int i = 0; i < n; i++) {
                String str=in.next();
                for (int j = 0; j < m; j++) {
                    chars[i][j]=str.charAt(j);

                }

            }
            int a=0,b=0;
            int count=score(a,b,chars);
            //行走；贪心，判断右走和下走分数哪个最高
            //边界是a<n,b<m，走到终点
            while(a<n||b<m){
                //边界：如果a=n-1只能右走，如果b=m-1只能下走
                if (a==n-1){
                    count+=score(a,b+1,chars);
                } else if (b==m-1) {
                    count+=score(a+1,b,chars);
                }
                if (a+1<n&&score(a+1,b,chars)>=score(a,b+1,chars)){
                    count+=score(a+1,b,chars);
                    a++;
                }else {
                    count+=score(a,b+1,chars);
                    b++;
                }

            }
            System.out.println(count);


        }
    }
}
