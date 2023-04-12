package com.caogang.offer;



/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 替换空格
 */

public class Offer05 {

    /**
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @author xiaogang
     * @date 2023/2/28 14:50
     */

    /**
     * 示例 1：
     *
     * 输入：s = "We are happy."
     * 输出："We%20are%20happy."
     *  
     *
     * 限制：
     *
     * 0 <= s 的长度 <= 10000
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        String str = "We are happy.";
        System.out.println(solution1(str));
        System.out.println(solution2(str));
    }

    public static String solution1(String str) {
         //时间复杂度O(n),空间复杂度O(1)
        return str.replace(" ", "%20");
    }

    public static String solution2(String str) {
        //时间复杂度O(n),空间复杂度O(1),模拟C语言的原数组扩容
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' '){
                count++;
            }
        }
        char[] newChars = new char[chars.length + count * 2];
        int k = newChars.length - 1;
        for (int i = chars.length - 1 ; i >= 0 ; i--) {
            if(chars[i] == ' '){
                //打破常规：从 "右" 向 "左" 排序
                newChars[k--] = '0';
                newChars[k--] = '2';
                newChars[k--] = '%';
            }else{
                newChars[k--] = chars[i];
            }
        }
        return new String(newChars);
    }

}
