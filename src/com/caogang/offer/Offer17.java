package com.caogang.offer;


import java.util.Arrays;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 打印从1到最大的n位数
 */

public class Offer17 {

    /**
     * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
     *
     * 示例 1:
     *
     * 输入: n = 1
     * 输出: [1,2,3,4,5,6,7,8,9]
     *  
     *
     * 说明：
     *
     * 用返回一个整数列表来代替打印
     * n 为正整数
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(2)));
    }

    /**
     * 时间复杂度O(n)，空间复杂度O(n)
     */
    public static int[] printNumbers(int n) {
        int max = 10;
        for (int i = 0; i < n-1; i++) {
            max = max * 10;
        }
        int[] arr = new int[max-1];
        for (int i = 0; i < max-1; i++) {
            arr[i] = i+1;
        }
        return arr;
    }
}
