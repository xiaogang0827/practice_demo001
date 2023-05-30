package com.caogang.offer;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author : caogang1
 * @date : 2023年02月28日 14:50
 * @description : 剑指 Offer 50. 第一个只出现一次的字符
 */

public class Offer50 {

    /**
     * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
     *
     * 示例 1:
     *
     * 输入：s = "abaccdeff"
     * 输出：'b'
     * 示例 2:
     *
     * 输入：s = ""
     * 输出：' '
     *  
     *
     * 限制：
     *
     * 0 <= s 的长度 <= 50000
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        String str = "abaccdeff";
        System.out.println(firstUniqCharI(str));
        System.out.println(firstUniqCharII(str));
    }

    /**
     * 时间复杂度O(1)，空间复杂度O(n)
     *
     */
    public static char firstUniqCharI(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.containsKey(chars[i]));
        }
        for (int i = 0; i < chars.length; i++) {
            if (!map.get(chars[i])) return chars[i];
        }
        return ' ';
    }

    public static char firstUniqCharII(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.containsKey(chars[i]));
        }
        Set<Map.Entry<Character, Boolean>> entries = map.entrySet();
        for (Map.Entry<Character, Boolean> entry : entries) {
            if (!entry.getValue()) return entry.getKey();
        }
        return ' ';
    }

}
