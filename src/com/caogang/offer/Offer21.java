package com.caogang.offer;


import java.util.Arrays;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 */

public class Offer21 {

    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
     *
     *  
     *
     * 示例：
     *
     * 输入：nums = [1,2,3,4]
     * 输出：[1,3,2,4]
     * 注：[3,1,2,4] 也是正确的答案之一。
     *  
     *
     * 提示：
     *
     * 0 <= nums.length <= 50000
     * 0 <= nums[i] <= 10000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 6};
        int[] exchange = exchange(arr);
        System.out.println(Arrays.toString(exchange));
    }

    /**
     * 时间复杂度O(n)，空间复杂度O(1)
     *
     */
    public static int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int temp;
        while (left < right){
            //找到要交换元素的下标是关键，左指针要小于右指针；左边是奇数，左指针右移
            while (left < right && nums[left] % 2 == 1) left++;
            //左指针要小于右指针；右边是偶数，右指针左移
            while(left < right && nums[right] % 2 == 0) right--;
            //利用双指针在原数组里进行元素交换，保证空间复杂度为O(1)
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}
