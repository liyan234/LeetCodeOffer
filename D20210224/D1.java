package D20210224;

public class D1 {
    public int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        while (b != 0) {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }

}
