package D20210224;

public class D3 {
    public int strToInt(String str) {
        char[] chs = str.trim().toCharArray();
        if(chs.length == 0)  {
            return 0;
        }
        int ret = 0;
        // 最后一位是 7
        int bndry = Integer.MAX_VALUE / 10;
        // 负数还是整数的标志位
        int sign = 1;
        // 从第一位开始 还是从第二位开始
        int i = 0;
        if(chs[0] == '-') {
            sign = -1;
            i = 1;
        } else if (chs[0] == '+') {
            i = 1;
        }

        for (int j = i; j < chs.length; j++) {
            if (chs[j] > '9' || chs[j] < '0') {
                break;
            } else if (ret > bndry || bndry == ret
                    && chs[j] > '7' ) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            ret = ret * 10 + (chs[j] - '0');
        }
        return ret * sign;
    }
}
