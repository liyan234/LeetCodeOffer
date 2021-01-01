package D20210101;


/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 * */
public class D2 {
    public int[] exchange(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        while  (left < right) {
            while ( judge(nums[right]) && left < right) {
                right--;
            }
            while ( !judge(nums[left]) && left < right) {
                left++;
            }
            swap(nums, left, right);
            left++;
            right--;
        }
        return nums;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public boolean judge(int i) {
        if ( i % 2 == 0) {
            return true;
            // 为偶数
        } else {
            return false;
            // 为奇数
        }
    }

}
