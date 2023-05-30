package com.caogang.offer;


import java.util.Arrays;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 剑指 Offer 40. 最小的k个数
 */

public class Offer40 {

    /**
     * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：arr = [3,2,1], k = 2
     * 输出：[1,2] 或者 [2,1]
     * 示例 2：
     *
     * 输入：arr = [0,1,2,1], k = 1
     * 输出：[0]
     *  
     *
     * 限制：
     *
     * 0 <= k <= arr.length <= 10000
     * 0 <= arr[i] <= 10000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        System.out.println(Arrays.toString(getLeastNumbers(arr, arr.length)));
    }

    /**
     * 时间复杂度O(n)，空间复杂度O(1)
     *
     */
    public static int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1);
        return Arrays.copyOf(arr, k);
    }

    public static void quickSort(int[] arr, int i, int j){
        if(i >= j) return;
        int left = i, right = j;
        while (left < right){
            while (left < right && arr[right] >= arr[i]) right--;
            while (left < right && arr[left] <= arr[i]) left++;
            swap(arr, left, right);
        }
        swap(arr, left, i);
        quickSort(arr, i, left - 1);
        quickSort(arr, left + 1, j);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
