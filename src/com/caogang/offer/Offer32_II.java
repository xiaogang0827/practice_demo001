package com.caogang.offer;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 剑指 Offer 32 - II. 从上到下打印二叉树 II
 */

public class Offer32_II {

    /**
     * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
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
     * 返回其层次遍历结果：
     *
     * [
     *   [3],
     *   [9,20],
     *   [15,7]
     * ]
     *  
     *
     * 提示：
     *
     * 节点总数 <= 1000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> integerList = new ArrayList<>();
        if(root == null) return integerList;
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        treeNodeQueue.add(root);
        while(!treeNodeQueue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            for (int i = treeNodeQueue.size(); i > 0; i--) {
                TreeNode poll = treeNodeQueue.poll();
                list.add(poll.val);
                if(poll.left != null) treeNodeQueue.add(poll.left);
                if(poll.right != null) treeNodeQueue.add(poll.right);
            }
            integerList.add(list);
        }
        return integerList;
    }
}
