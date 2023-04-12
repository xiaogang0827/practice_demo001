package com.caogang.offer;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 斐波那契数列
 */

public class Offer10_I {

    /**
     * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项（即 F(N)）。斐波那契数列的定义如下：
     *
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
     *
     * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @author xiaogang
     * @date 2023/2/28 14:50
     */

    /**
     * 示例 1：
     *
     * 输入：n = 2
     * 输出：1
     * 示例 2：
     *
     * 输入：n = 5
     * 输出：5
     *
     *
     * 提示：
     *
     * 0 <= n <= 100
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
        System.out.println(fibPro(n));
        System.out.println(fibindex(10));
    }

    /**
     * 斐波那契数列（递归调用）；时间复杂度O(n)，空间复杂度O(n)
     */
    public static int fib(int n){
        if(n <= 1) return n;
        int sum = (fib(n - 1) + fib(n - 2)) % 1000000007;
        return sum;
    }

    /**
     * 斐波那契数列（递归调用）(加强版)；时间复杂度O(n)，空间复杂度O(n)
     */
    static int[] nums;
    public static int fibPro(int n){
        nums = new int[n + 1];
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = -1;
        }
        return f(n);
    }
    public static int f(int n){
        if(n <= 1) return n;
        if(nums[n] != -1){
            return nums[n];
        }
        int sum = (f(n - 1) + f(n - 2)) % 1000000007;
        nums[n] = sum;
        return sum;
    }

    /**
     * 斐波那契数列（移动下标法)；时间复杂度O(1)，空间复杂度O(n)
     */
    public static int fibindex(int n){
        if(n <= 1) return n;
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 2 ; i <= n ; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }
}
