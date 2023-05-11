package com.caogang.offer;


import java.util.Arrays;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 剑指 Offer 22. 链表中倒数第k个节点
 */

public class Offer22 {

    /**
     * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
     *
     * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
     *
     *  
     *
     * 示例：
     *
     * 给定一个链表: 1->2->3->4->5, 和 k = 2.
     *
     * 返回链表 4->5.
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


     public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;
        ListNode listNode4 = new ListNode(4);
        listNode3.next = listNode4;
        ListNode listNode5 = new ListNode(5);
        listNode4.next = listNode5;
        ListNode listNode6 = new ListNode(6);
        listNode5.next = listNode6;
        System.out.println(getKthFromEnd(listNode1, 3));
    }

    /**
     * 时间复杂度O(n)，空间复杂度O(1)
     * 双指针里的快、慢指针问题
     */
    public static ListNode getKthFromEnd(ListNode head, int k) {
        //准备两个指针，一快、一慢
        ListNode fast = head;
        ListNode slow = head;
        //快指针先跑k步
        while(k-- > 0) fast = head.next;
        //然后一起跑到尽头
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        //慢指针没跑完的，就是相差的步数
        return slow;
    }
}
