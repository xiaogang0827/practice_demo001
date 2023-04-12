package com.caogang.offer;


/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 青蛙跳台阶问题
 */

public class Offer10_II {

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
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
     * 输出：2
     * 示例 2：
     *
     * 输入：n = 7
     * 输出：21
     * 示例 3：
     *
     * 输入：n = 0
     * 输出：1
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
        System.out.println(solution(n));
    }

    /**
     * 青蛙跳台阶问题（类似斐波那契数列问题，使用移动下标法）；时间复杂度O(n)，空间复杂度O(1)
     */
    public static int solution(int n) {
        if(n == 0) return 1;
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return sum;
    }
}
