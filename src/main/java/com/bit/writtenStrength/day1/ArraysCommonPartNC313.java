package com.bit.writtenStrength.day1;

import java.util.ArrayList;

public class ArraysCommonPartNC313 {
    /**
     * 暴力解法
     *
     * 本题重点：#hash空间换时间 #数组制作建议哈希
     * 优化后：
     * 遍历数组2 查看哈希表中是否存在
     * 去重
     * @param nums1
     * @param nums2
     * @return
     */
    public ArrayList<Integer> intersection (ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write code here
        ArrayList<Integer> nums3=new ArrayList<>();
        for (int i = 0; i < nums2.size(); i++) {
            if (nums1.contains(nums2.get(i))&& !nums3.contains(nums2.get(i))){
                nums3.add(nums2.get(i));
            }
        }
        return nums3;
    }
}
