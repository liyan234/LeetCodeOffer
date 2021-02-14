package D20210214;

import java.util.ArrayList;

public class D1 {
    public static int[][] findContinuousSequence(int target) {
        int le = 1; // 左边界
        int ri = 1; // 右边界
        int sum = 0;
        ArrayList<int[]> list = new ArrayList<>();

        // 左边界小于target的一半
        while (le <= target / 2) {
            if (sum < target) {
                sum += ri;
                ri++;
            } else if ( sum > target) {
                sum -= le;
                le++;
            } else {
                // sum == target;
                int c = 0;
                int[] ins = new int[ri - le];
                for (int k = le; k < ri; k++) {
                    ins[c] = k;
                    c++;
                }
                list.add(ins);
                sum -= le;
                le++;
            }
        }
        return list.toArray(new int[list.size()][]);

    }

    public static void main(String[] args) {
        int[][] ss = findContinuousSequence(9);
        System.out.println(ss);
    }
}
