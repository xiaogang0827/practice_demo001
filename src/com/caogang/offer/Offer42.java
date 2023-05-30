package com.caogang.offer;


import java.util.Arrays;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 剑指 Offer 42. 连续子数组的最大和
 */

public class Offer42 {

    /**
     * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
     *
     * 要求时间复杂度为O(n)。
     *
     *  
     *
     * 示例1:
     *
     * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出: 6
     * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
     *  
     *
     * 提示：
     *
     * 1 <= arr.length <= 10^5
     * -100 <= arr[i] <= 100
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(getLeastNumbers(arr));
        System.out.println(solution(arr));
    }

    /**
     * 时间复杂度O(n)，空间复杂度O(1)
     *
     */
    public static int getLeastNumbers(int[] arr) {
       int sum = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = Math.max(sum + arr[i], arr[i]);
            max = Math.max(max, sum);
        }
        return max;
    }

    public static int solution(int[] arr){
        int len = arr.length;
        int[] dp = new int[len];
        dp[0] = arr[0];
        int res = dp[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1] + arr[i], arr[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
