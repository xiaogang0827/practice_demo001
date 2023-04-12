package com.caogang.offer;


import java.util.HashMap;
import java.util.Map;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 重建二叉树
 */

public class Offer07 {

    /**
     * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
     * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @author xiaogang
     * @date 2023/2/28 14:50
     */

    /**
     * 示例 1:
     *
     *
     * 前序遍历：先root，再左子树，再右子树 => 3, 9 , 20, 15 , 7
     * 中序遍历：先左子树，再root，再右子树 => 9, 3 , 15, 20 , 7
     * 后序遍历：先左子树，再右子树，再root => 9, 15, 7, 20, 3
     *
     *
     * Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
     * Output: [3,9,20,null,null,15,7]
     * 示例 2:
     *
     * Input: preorder = [-1], inorder = [-1]
     * Output: [-1]
     *  
     *
     * 限制：
     *
     * 0 <= 节点个数 <= 5000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/zhong-jian-er-cha-shu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 定义一个map用来记录节点和下标
     */
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        System.out.println(solution1(preorder, inorder));
    }

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode solution1(int[] preorder, int[] inorder) {
        //时间复杂度O(n),空间复杂度O(n)
        //判断树是否有节点
        if(preorder == null && preorder.length == 0) return null;
        //记录中续遍历中节点和下标
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        //调用递归函数
        TreeNode tree = f(preorder, 0, preorder.length -1, inorder, 0, inorder.length -1);
        return tree;
    }

    static TreeNode f(int[] preorder, int l1, int r1, int[] inorder, int l2, int r2){
        //递归函数结束
        if(l1 > r1 && l2 > r2){
            return null;
        }
        TreeNode root = new TreeNode(preorder[l1]);
        int i = map.get(root.val);
        //遍历左子树
        root.left = f(preorder, l1+1, l1+(i-l2), inorder, l2, i-1);
        //遍历右子树
        root.right = f(preorder, l1+(i-l2)+1, r1, inorder, i+1, r2);
        return root;
    }

}
