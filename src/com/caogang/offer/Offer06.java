package com.caogang.offer;


import java.util.Arrays;
import java.util.Stack;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 从尾到头打印列表
 */

public class Offer06 {

    /**
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @author xiaogang
     * @date 2023/2/28 14:50
     */

    /**
     * 示例 1：
     *
     * 输入：head = [1,3,2]
     * 输出：[2,3,1]
     *
     *
     * 限制：
     *
     * 0 <= 链表长度 <= 10000
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
//        System.out.println(Arrays.toString(solution1(listNode)));
        System.out.println(Arrays.toString(solution2(listNode)));
    }

    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static int[] solution1(ListNode head) {
         //时间复杂度O(n),空间复杂度O(1)
        if(head == null) return new int[0];
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        int k = count -1 ;
        while (head != null){
            //打破常规：从 "右" 向 "左" 排序
            arr[k--] = head.val;
            head = head.next;
        }
        return arr;
    }

    public static int[] solution2(ListNode head) {
        //时间复杂度O(n),空间复杂度O(1),模拟C语言的原数组扩容
        if(head == null) return new int[0];
        Stack<Integer> stack = new Stack();
        int count = 0;
        while (head != null){
            count++;
            stack.push(head.val);
            head = head.next;
        }
        int[] arr = new int[count];
        int i = 0;
        while (!stack.empty()){
            arr[i++] = stack.pop();
        }
        return arr;
    }

}
