package D20201230;


/**
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
 * 一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），
 * 也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，
 * 因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */
public class D1 {

    public int movingCount(int m, int n, int k) {
        // 辅助数组 遍历过了 改为 true
        boolean[][] vis = new boolean[m][n];
        //
        int ret = dfs(m, n, 0, 0, k, vis);
        return ret;
    }

    public int dfs (int m, int n, int i, int j, int k, boolean[][] vis) {
        // 越界判定 大于k判定  以及是否遍历过判定
        if (i < 0 || i >= m  || j < 0 || j >= n || getNum(i) + getNum(j) > k || vis[i][j]) {
            return 0;
        }
        // 遍历过了改为true
        vis[i][j] = true;
        return dfs(m, n, i + 1, j, k, vis) + dfs (m , n, i, j+1, k, vis) + 1;
    }

    public int getNum(int x) {
        int count = 0;
        while (x != 0) {
            count = count + x % 10;
            x = x / 10;
        }
        return count;
    }
}
