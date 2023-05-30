package com.caogang.function;

import java.util.concurrent.*;

/**
 * @author : caogang1
 * @date : 2023年05月07日 17:31
 * @description : 二分查找
 */

public class Half {

    public static void main(String[] args) {
        find1(100000000, 99999999);
        find2(100000000, 99999999);
    }

    public static boolean find1(int n, int target){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        long t1 = System.currentTimeMillis();
        int j = 0;
        while (j!=n){
            if(target == arr[j++]) {
                long t2 = System.currentTimeMillis();
                System.out.println("时间："+String.valueOf(t2 - t1));
                return true;
            }
        }
        return false;
    }

    /**
     * 1、二分查找的关键，就是利用左右或者高低两个指针的移动，来确定目标元素在容器内的位置。
     * 2、指针通常都为元素下标，左指针或者低位指针一般为0，右指针或者高位指针通常为容器的长度减1
     * 3、目标元素与下标为(低+高)/2的元素比较大小，目标元素大，则 低位指针=(低+高)/2+1，目标元素小，则 高位指针=(低+高)/2-1
     * 4、二分法的前提是，查找的目标容器是一个非递减区间
     */
    public static boolean find2(int n, int target){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        long t1 = System.currentTimeMillis();
        int left = 0;
        int right = n - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if(target == arr[mid]){
                long t2 = System.currentTimeMillis();
                System.out.println("时间："+String.valueOf(t2 - t1));
                return true;
            }else if(target > arr[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;
    }

}
