package D20210111;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 在字符串 s 中找出第一个只出现一次的字符。
 * 、如果没有，返回一个单空格。 s 只包含小写字母
 *
 * */
public class D2 {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> map = new HashMap<>();
        char[] chs = s.toCharArray();
        for (char c : chs) {
            map.put(c, !map.containsKey(c));
        }
        for (char c : chs) {
            if (map.get(c)) {
                return c;
            }
        }
        return ' ';

    }
}
