package D20210212;

public class D2 {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            // 给出的数是顺序递增的的
            int sum = nums[i] + nums[j];
            if (sum < target) {
                // 小于的时候
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return (new int[]{nums[i], nums[j]});
            }
        }
        return null;
    }
}
