package D20210111;


/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *
 *
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * */
public class D1 {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int ret = nums[0];
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] == ret) {
                count++;
            } else {
                if (count == 0) {
                    ret = nums[i];
                    count++;
                } else{
                    count--;
                }
            }
        }
        return ret;
    }
}
