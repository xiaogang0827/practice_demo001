package com.caogang.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 数组中重复的数字
 */

public class Offer03 {

    /**
     * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
     * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @author xiaogang
     * @date 2023/2/28 14:50
     */

    /**
     * 示例 1：
     *
     * 输入：
     * [2, 3, 1, 0, 2, 5, 3]
     * 输出：2 或 3
     */

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(solution1(nums));
        System.out.println(solution2(nums));
        System.out.println(solution3(nums));
    }

    public static int solution1(int[] nums) {
         //时间复杂度O(N2),空间复杂度O(1)
         if(nums.length == 0) return 0;
         if(nums.length == 1) return nums[1];
         int a;
         int b = 0;
         for(int i = 0 ; i < nums.length ; i ++ ){
             a = nums[i];
             for(int j = 0 ; j < nums.length ; j++){
                 if(a == nums[j]) b++;
             }
             if(b == 1){
                 b = 0;
             }else{
                 return a;
             }
         }
         return -1;
    }

    public static int solution2(int[] nums) {
        //时间复杂度O(N),空间复杂度O(N)
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])) return nums[i];
        }
       return -1;
    }

    public static int solution3(int[] nums) {
        //时间复杂度O(N),空间复杂度O(1)
        for (int i = 0; i < nums.length; i++) {
            while (i != nums[i]){
                if(nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                int k = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = k;
            }
        }
        return -1;
    }

}
