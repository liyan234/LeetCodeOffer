package D20210209;

public class D1 {
    public static int findNthDigit(int n) {
        // 设置起始数字
        long start = 1;
        // 设置位数
        int d = 1;
        // 设置总共有几个数
        long count = 9;
        // 需要是 > 不能是 >=
        while(n > count) {
            //减去几个数
            n -= count;
            d += 1;
            start *= 10;
            // 二位数有总共有90个 有180个数字
            // 三位数有900个 有2700个数字
            count = d * start * 9;
            // 位数 * 起始数字 * 9
        }
        // 找到了第几个数字
        long x =  start + (n - 1) / d ;
        // 找到数字之后 序列化 找到第几位
        return Long.toString(x).charAt((n - 1) % d) - '0';
    }

    public static void main(String[] args) {
        int c = findNthDigit(1000000000);
        System.out.println(c);
    }
}
