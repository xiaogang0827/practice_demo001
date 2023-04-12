package com.caogang.offer;



/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 数值的整数次方
 */

public class Offer16 {

    /**
     * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
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
     * 输入：x = 2.00000, n = 10
     * 输出：1024.00000
     * 示例 2：
     *
     * 输入：x = 2.10000, n = 3
     * 输出：9.26100
     * 示例 3：
     *
     * 输入：x = 2.00000, n = -2
     * 输出：0.25000
     * 解释：2-2 = 1/22 = 1/4 = 0.25
     *  
     *
     * 提示：
     *
     * -100.0 < x < 100.0
     * -231 <= n <= 231-1
     * -104 <= xn <= 104
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        double x = 2;
        int n = 9;
        System.out.println(myPow(x, n));
    }

    /**
     * 时间复杂度O(1)，空间复杂度O(1)
     */
    public static double myPow(double x, int n) {
        if(x == 0.0) return x;
        long num = n;
        double res = 1.0;
        if(n < 0){
            x = 1 / x;
            num = -num;
        }
        while(num > 0){
            if((num & 1) == 1){
                res = res * x;
            }
            x = x * x;
            num = num >> 1;
        }
        return res;
    }
}
