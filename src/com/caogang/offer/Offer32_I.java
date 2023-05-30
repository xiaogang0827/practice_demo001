package com.caogang.offer;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 剑指 Offer 32 - I. 从上到下打印二叉树
 */

public class Offer32_I {

    /**
     * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
     *
     *  
     *
     * 例如:
     * 给定二叉树: [3,9,20,null,null,15,7],
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * 返回：
     *
     * [3,9,20,15,7]
     *  
     *
     * 提示：
     *
     * 节点总数 <= 1000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }


    public static void main(String[] args) {
    }

    /**
     * 时间复杂度O(n)，空间复杂度O(n)
     * 双指针翻转链表
     */
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        List<Integer> integerList = new ArrayList<>();
        while (!treeNodeQueue.isEmpty()){
            TreeNode poll = treeNodeQueue.poll();
            integerList.add(poll.val);
            if(poll.left != null) treeNodeQueue.add(poll.left);
            if(poll.right != null) treeNodeQueue.add(poll.right);
        }
        int[] arr = new int[integerList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = integerList.get(i);
        }
        return arr;
    }
}
