package D20201230;


/**
 * 实现函数double Power(double base, int exponent)，求base的exponent次方。
 * 不得使用库函数，同时不需要考虑大数问题。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */
public class D4 {

    public double myPow(double x, int n) {
        if (x ==  0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        long b = n;

        double res = 1.0;
        // 当b 是负数的时候
        if (b < 0) {
            b = -b;
            x = 1/x;
        }

        while (b > 0) {
            // 相与 得1 的时候 乘入
            if ((b & 1) == 1) {
                res = res * x;
            }
            // 向前进位的时候得到x的进位值
            x = x * x;
            b >>>= 1;
        }
        return res;
    }
}
