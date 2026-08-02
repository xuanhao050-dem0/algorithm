package com.bit.slidingWindows;

public class LongestNonRepeatingSubarray02 {
    public static int minSubArrayLen(int[] s) {
        //变量：左右指针 长度 最大长度
        //数据结构：哈希表
        int left=0,right=0,len=1,maxLen=1;
        int[] hash=new int[10];
        hash[s[left]]++;
        while(right< s.length-1){
            /**
             * 进窗口 哈希表加数字
             * 长度++
             *
             * 判断 如果这个数字大于1
             *
             * 出窗口之前是该次改动长度最长==》判断是否更新maxlen
             * 出窗口 哈希表减数字
             * 长度--
             *
             */
            right++;
            hash[s[right]]++;
            len++;
            maxLen=Math.max(maxLen,len);

            while(hash[s[right]]>1){
                maxLen=Math.max(maxLen,len);
                left++;
                hash[s[left-1]]--;
                len--;
            }

        }

        return maxLen;
    }
    //数字版
    public static int minSubArrayLen1(int[] s) {
        //变量：左右指针 长度 最大长度
        //数据结构：哈希表
        int left=0,right=0,len=0;
        int[] hash=new int[100000];
        while(right<s.length){
            hash[s[right]]++;
            while(hash[s[right]]>1){
                left++;
                hash[s[left]]--;
            }
            len=Math.max(len,right-left+1);
            right++;

        }
        return len;
    }
    //字符版

    /**
     * 变量：左右指针 长度 最大长度
     * 数据结构：哈希表
     * @param s
     * @return
     */
    public static int minSubArrayLen2(String s) {

        char[] chars=s.toCharArray();
        int left=0,right=0,len=0;
        int[] hash=new int[128];//s 由英文字母、数字、符号和空格组成。ascll码表中只有128位
        while(right< chars.length){
            hash[chars[right]]++;
            while(hash[chars[right]]>1){
//                //先减再出窗口
//                left++;
//                hash[chars[left-1]]--;
                hash[chars[left]]--;
                left++;
            }
            len=Math.max(len,right-left+1);
            right++;

        }
        return len;
    }


    public static void main(String[] args) {
        String s="pwwkew";
        System.out.println(minSubArrayLen2(s));


    }
}
