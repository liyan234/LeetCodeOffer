package D20201229;


/**
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 * */
public class D1 {
    public int maxSubArray (int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > 0) {
                nums[i] = nums[i-1] + nums[i];
            }
            if (nums[i] > sum) {
                sum = nums[i];
            }
        }
        return sum;
    }

}
