package D20210217;

public class D2 {
    // 约瑟夫环
    public int lastRemaining(int n, int m) {
        int res = 0;
        //
        for (int i = 1; i <= n; i++) {
            res = (res + m) % i;
        }
        return res;
    }
}
