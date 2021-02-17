package D20210217;

public class D4 {
    public int sumNums(int n) {
        // 先判断 && 前面的 判断不过去直接返回
        // 我都没想到 tm 的

        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
