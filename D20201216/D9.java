package D20201216;


/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */
public class D9 {
    public static  int numWays(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a = 1; // n == 0时
        int b = 1; // n == 1时
        for (int i = 0; i < n ; i++) {
            int sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        // n == 1 ; a = 1, b = 2;  ==> 1
        // n == 2 ; a = 2, b = 3;  ==> 2;
        // n == 3 ; a = 3, b = 5;  ==> 3;
        return a;

    }

    public static void main(String[] args) {
        int x = numWays(3);
        System.out.println(x);
    }
}
