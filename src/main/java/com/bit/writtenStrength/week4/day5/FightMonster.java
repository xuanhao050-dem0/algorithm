package com.bit.writtenStrength.week4.day5;

import java.util.Scanner;

public class FightMonster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int t = in.nextInt();
            while(t>0){
                int count=0;
                int heroBlood = in.nextInt();
                int heroAttack = in.nextInt();
                int monsterBlood = in.nextInt();
                int monsterAttack = in.nextInt();
                int b = monsterBlood;
                while(heroBlood>0){
                    b-=heroAttack;
                    //?重置怪兽血量
                    if(b<=0){
                        count++;
                        continue;
                        b=monsterBlood;
                    }

                    heroBlood-=monsterAttack;
                }
                System.out.println(count);
                t--;
            }


        }
    }
}
