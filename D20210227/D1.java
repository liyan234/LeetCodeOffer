package D20210227;

public class D1 {
    public double[] dicesProbability(int n) {
        //n 代表筛子
        //6 * n + 1 代表 摇的数
        double[][] dp = new double[n + 1][6*n + 1];
        // 代表摇一个筛子的时候出现的概率
        for (int i = 1; i <= 6; i++) {
            dp[1][i] = (double)1/6;
        }
        //摇n个筛子的时候每一个点数出现的概率
        for (int i = 2; i < n + 1; i++) {
            //  6 * i 代表摇n个筛子的时候出现的最大点数
            for (int j = i; j <= 6*i; j++) {

                for (int k = 1; k <= 6; k++) {
                    // 点数小于k的话 就不可能摇出
                    if(j - k < 1) {
                        continue;
                    }
                    // i是几个筛子 j是点数
                    // i - 1代表
                    dp[i][j] += dp[1][k] * dp[i - 1][j - k];
                }
            }
        }
        // 有n个筛子， 那木摇出的点子数总共有n个可能
        double[] res = new double[n * 5 + 1];
        int id = n;
        for (int i = 0; i < res.length; i++) {
            // id为点子数
            // n为筛子数
            res[i] = dp[n][id];
            id++;
        }
        return res;

    }
}
