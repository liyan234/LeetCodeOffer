package D20210114;

public class D3 {

    public int missingNumber(int[] nums) {
        // 二分法
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int m = (i  + j) / 2;
            if ( m == nums[m]) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }
}
