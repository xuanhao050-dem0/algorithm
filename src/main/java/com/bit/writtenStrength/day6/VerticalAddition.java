package com.bit.writtenStrength.day6;

public class VerticalAddition {
    public String solve (String s, String t) {

        int a=s.length()-1,b=t.length()-1;
        int tmp=0;
        StringBuilder sum=new StringBuilder();
        while(a>=0||b>=0|tmp!=0){
            if (a>=0)tmp+=s.charAt(a--)-'0';
            if (b>=0)tmp+=t.charAt(b--)-'0';
            sum.append(tmp%10);
            tmp/=10;
        }

        return sum.reverse().toString();
    }

    public static void main(String[] args) {
        VerticalAddition verticalAddition=new VerticalAddition();
        System.out.println(verticalAddition.solve("99","1"));
    }
}
