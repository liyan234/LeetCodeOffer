package D20201230;


/**
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jian-sheng-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */

/**
 *   绳子长为 8的时候
 *   我们定义的数组长度为9
 *   然后从下标1 开始
 *   dp[2] = {dp[2],   {dp[1], 1} * {dp[2-1], 2-1} }
 *   dp[2] = { 1 * 1} = 1
 *
 *   dp[3] = {0, {dp[2], 2} * { dp[3-1], 3-1}}
 *   dp[3] = {0, 4}
 *
 * */
public class D2 {

    public int cuttingRope(int n) {
        if (n == 0 || n == 1) {
            return 0;
        };
        if ( n == 2) {
            return 1;
        }
        if ( n == 3) {
            return 2;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;

        //
        for (int i = 2; i < n + 1; i++) {
            // 走到一半 另一半也就出来了
            for (int j = 1; j <= i / 2; j++) {
                int tmp0 = Math.max(j, dp[j]);
                int tmp1 = Math.max(i - j, dp[i - j]);
                dp[i] = Math.max(dp[i], tmp0 * tmp1);
            }
        }
        return dp[n];
    }
}
