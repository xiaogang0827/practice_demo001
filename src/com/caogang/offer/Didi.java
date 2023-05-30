package com.caogang.offer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 数组中重复的数字
 */

public class Didi {

    /**
     * 给你一个整数数组 nums ，你需要找出一个连续子数组 ，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
     *
     * 请你找出符合题意的最短子数组，并输出它的长度。
     * 输入：nums = [2,6,4,8,10,9,15]
     * 输出：5
     * 解释：你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
     * 输入：nums = [1,2,3,4]
     * 输出：0
     */

    public static void main(String[] args) {
        int[] nums = new int[]{2,6,4,8,10,9,15};
        System.out.println(solution(nums));
        
    }

    public static int solution(int[] nums) {
        int[] newArr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int a = 0, b = nums.length - 1;
        while (nums[a] == newArr[a]){
            a++;
        }
        while (nums[b] == newArr[b]){
            b--;
        }
         return b - a + 1;
    }

}
