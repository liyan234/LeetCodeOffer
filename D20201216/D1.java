package D20201216;


/**
 *在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
 * 请找出数组中任意一个重复的数字。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */
public class D1 {

    public int findRepeatNumber(int[] nums) {
        int tmp;
        for(int i = 0; i < nums.length; i++) {
            // 若是刚好相等则不进入循环
            while(i != nums[i]) {
                // 就是假如 nums[8]==9
                // 就等到   nums[8]==nums[nums[8]] ---> nums[8]==9
                // 这样的话就直接重复了
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                // 没有重复的话  本来就是一个萝卜一个坑
                // 就把原来的得到的这个萝卜 放入正确的坑中
                // 相互交换就可以了
                tmp = nums[i];  // tmp == nums[8] == 9
                nums[i] = nums[tmp]; // nums[8] == nums[9]
                nums[tmp] = tmp; // nums[9] == 9
            }
        }
        return-1;
    }
}
