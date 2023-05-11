package com.caogang.offer;


/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 剑指 Offer 24. 反转链表
 */

public class Offer24 {

    /**
     * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
     *
     *  
     *
     * 示例:
     *
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     *  
     *
     * 限制：
     *
     * 0 <= 节点个数 <= 5000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof
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
        System.out.println(reverseList(listNode1).next.val);
    }

    /**
     * 时间复杂度O(n)，空间复杂度O(1)
     * 双指针翻转链表
     */
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
