package com.caogang.offer;


import java.util.Stack;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 用两个栈实现队列
 */

public class Offer09 {

    /**
     * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
     * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
     *
     * 队：先进先出
     * 栈：先进后出
     * 两个栈实现一个队列：元素先进Stack1，从Stack1弹栈后再进Stack2，这样再从Stack2弹栈时，就是进Stack1的顺序。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @author xiaogang
     * @date 2023/2/28 14:50
     */

    /**
     * 示例 1：
     *
     * 输入：
     * ["CQueue","appendTail","deleteHead","deleteHead","deleteHead"]
     * [[],[3],[],[],[]]
     * 输出：[null,null,3,-1,-1]
     * 示例 2：
     *
     * 输入：
     * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
     * [[],[],[5],[2],[],[]]
     * 输出：[null,-1,null,null,5,2]
     * 提示：
     *
     * 1 <= values <= 10000
     * 最多会对 appendTail、deleteHead 进行 10000 次调用
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    static class CQuence{

        Stack<Integer> stack1;
        Stack<Integer> stack2;

        //构造自定义队列
        public CQuence(){
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        //模拟入队
        public void appendTail(int value){
            stack1.push(value);
        }

        //模拟出队
        public int deleteHead(){
            if(!stack2.empty()){
                return stack2.pop();
            }
            if(!stack1.empty()){
                while (!stack1.empty()){
                    stack2.push(stack1.pop());
                }
                return stack2.pop();
            }
            return -1;
        }

    }

}
