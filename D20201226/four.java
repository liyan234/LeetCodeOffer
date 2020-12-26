package D20201226;


import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
 *
 * 交换字母的定义是取两个下标 i 和 j （下标从 0 开始），只要 i!=j 就交换 A[i] 和 A[j] 处的字符。例如，在 "abcd" 中交换下标 0 和下标 2 的元素可以生成 "cbad" 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/buddy-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class four {
    public static boolean buddyStrings(String A, String B) {
        if(A.length() != B.length()) {
            return false;
        }
        if(A.equals(B)) {

            for (int i = 0; i < A.length(); i++) {
                // 索引找到是否有相同的字符
                if(A.indexOf(A.charAt(i), i + 1) != -1) {
                    return true;
                }
                return false;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            // 添加字符串下标
            if( A.charAt(i) != B.charAt(i) ) {
                list.add(i);
            }
        }
        if (list.size() == 2) {
            boolean x = A.charAt(list.get(0)) == B.charAt(list.get(1));
            boolean y = A.charAt(list.get(1)) == B.charAt(list.get(0));
            return x && y;
        }
        return false;
    }

    public static void main(String[] args) {
        buddyStrings("ba", "ab");
    }
}
