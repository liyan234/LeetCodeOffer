package D20210209;

public class D2 {

    public int translateNum(int num) {
        String str = String.valueOf(num);
        if (str.length() < 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        // 循环数组 解决空间问题
        for (int i = 2; i <= str.length(); i++) {
            String x = str.substring(i-2, i);
            int c = a;
            if (x.compareTo("10") >= 0 && x.compareTo("25") <= 0) {
                c = a + b;
            }
            b = a;
            a = c;
        }
        return a;
    }

}
