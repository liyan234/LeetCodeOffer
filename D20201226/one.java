package D20201226;
/**
 * 输入一个数组：1,3,2,4,1,2；输出出现次数最多的数字，如果次数最多的有多个，输出最先出现的那个。
 * */
public class one {

    public static int maxNum (int[] nums) {
        int count = 0;
        int compare = 0;
        int max = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            count = 0;
            for (int j = i; j < len; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > compare) {
                compare = count;
                max = nums[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int x = maxNum(new int[]{1,3,2,4,1,2});
        System.out.println(x);
    }

}
