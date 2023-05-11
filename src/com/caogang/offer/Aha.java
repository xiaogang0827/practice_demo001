package com.caogang.offer;


import java.util.Arrays;



/**
 * @author caogang
 */
public class Aha {

    /**
     * 拼凑单词（判断混乱的字符堆能否拼凑出目标单词）
     * 编写函数 scramble(str1, str2)，当 str1 字符串中的部分字符能够重排后与 str2 匹配就返回 true，否则返回 false。
     * 注意：
     *
     * - 字符串只包含 a - z 的小写英文字符，不包含标点符号或数字。
     * - 请考虑执行效率最高的实现方式。
     *
     * - 如果 str1 或 str2 为空字符串时返回false。
     *
     * 示例1
     * 输入：str1 = 'rkqodlw', str2 = 'world'
     * 输出：true
     * 示例2
     * 输入：str1 = 'cedewaraaossoqqyt', str2 = 'codewars'
     * 输出：true
     * 示例3
     * 输入：str1 = 'katas', str2 = 'steak'
     * 输出：false
     */

    public static void main(String[] args) {
        String str1 = "rkqodlw";
        String str2 = "world";
        System.out.println(scramble1(str1, str2));
        System.out.println(scramble2(str1, str2));
    }

    public static boolean scramble1(String str1, String str2) {
        char[] chars2 = str2.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            if(!str1.contains(String.valueOf(chars2[i]))) return false;
        }
        return true;
    }

    public static boolean scramble2(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        boolean flag = true;
        boolean count = true;
        for (int i = 0; i < chars2.length; i++) {
            for (int j = 0; j < chars1.length; j++) {
                if(count && chars2[i] == chars1[j]){
                    flag = true;
                    count = false;
                    chars1[j] = '@';
                }else if(count && chars2[i] != chars1[j]){
                    flag = false;
                }
            }
            count = true;
        }
        return flag;
    }

}
