package week2.day2;

/**
 * 将数组排序 sort
 * 用一个指针遍历数组，如果前一个和后一个相差1，count++
 * 最终返回最大的count
 */

import java.util.ArrayList;
import java.util.Comparator;

public class MLS {
    public int MLS1 (int[] arr) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for (int j : arr) {
            arr1.add(j);
        }
        //arr1.sort();
        int fast=0,count=1;
        while(fast<arr1.size()){
            fast++;
            if (arr1.get(fast)- arr1.get(fast-1)==-1)
                count++;
            else{
                arr2.add(count);
                count=0;
            }
        }
        //arr2.sort();
        return arr2.get(arr2.size()-1);
    }
}
