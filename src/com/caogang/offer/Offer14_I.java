package com.caogang.offer;


/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 剪绳子
 */

public class Offer14_I {

    /**
     * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
     * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
     * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
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
     * 输入: 2
     * 输出: 1
     * 解释: 2 = 1 + 1, 1 × 1 = 1
     * 示例 2:
     *
     * 输入: 10
     * 输出: 36
     * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
     * 提示：
     *
     * 2 <= n <= 58
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        int n = 10;
        System.out.println(cuttingRope(n));
    }

    /**
     * 时间复杂度O(1)，空间复杂度O(1)
     */
    public static int cuttingRope(int i) {
        int m = i / 3;
        int n = i % 3;
        if(n == 0){
            return f(3, m);
        }else if(n == 1){
            return f(3, m -1) * 4;
        }else{
            return f(3, m) * 2;
        }
    }
    
    public static int f(int m, int n){
        int sum = m;
        for (int i = 1; i < n; i++) {
            sum = sum * m;
        }
        return sum;
    }
}
