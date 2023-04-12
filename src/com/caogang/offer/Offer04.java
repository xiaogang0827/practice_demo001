package com.caogang.offer;


/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 二维数组中的查找
 */

public class Offer04 {

    /**
     * 在一个 n * m 的二维数组中，每一行都按照从左到右 非递减 的顺序排序，
     * 每一列都按照从上到下 非递减 的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @author xiaogang
     * @date 2023/2/28 14:50
     */

    /**
     * 示例:
     *
     * 现有矩阵 matrix 如下：
     *
     * [
     *   [1,   4,  7, 11, 15],
     *   [2,   5,  8, 12, 19],
     *   [3,   6,  9, 16, 22],
     *   [10, 13, 14, 17, 24],
     *   [18, 21, 23, 26, 30]
     * ]
     * 给定 target = 5，返回 true。
     *
     * 给定 target = 20，返回 false。
     *
     *  
     *
     * 限制：
     *
     * 0 <= n <= 1000
     *
     * 0 <= m <= 1000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};
        int target = 5;
        System.out.println(solution1(nums, target));
        System.out.println(solution2(nums, target));
    }

    public static boolean solution1(int[][] nums, int target) {
         //时间复杂度O(N2),空间复杂度O(1)
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j] == target) return true;
            }
        }
        return false;
    }

    public static boolean solution2(int[][] nums, int target) {
        //时间复杂度O(mlogn),空间复杂度O(1)
        if(nums.length == 0) return false;
        if(nums.length == 1 && nums[0].length == 1) return target == nums[0][0];
        int i = nums.length - 1;
        int j = 0;
        while(i >= 0 && j < nums[0].length){
            if(nums[i][j] > target){
                i--;
            }else if(nums[i][j] < target){
                j++;
            }else{
                return true;
            }
        }
        return false;
    }

}
