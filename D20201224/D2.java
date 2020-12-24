package D20201224;



/**
 *
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。
 *
 * */
public class D2 {
    public String minNumber(int[] nums) {

        String[] str = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        // 快速排序来进行
        fastSort(str, 0, str.length - 1);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        return sb.toString();

    }

    private void fastSort(String[] strs, int left , int right) {
        if (left >=  right) {
            return;
        }
        int index = helpFastSort(strs, left, right);

        fastSort(strs, left, index - 1);
        fastSort(strs, index + 1, right);
    }

    private int helpFastSort(String[] strs, int left, int right) {


        String index = strs[left];
        int start = left;
        int end = right;
        while ( start <  end) {
            if(start > end &&  (strs[end] + index).compareTo( strs[end] + index ) >= 0) {
                end--;
            }
            if (start > end && (strs[start] + index).compareTo( strs[start] + index ) <= 0) {
                start++;
            }
            swap(strs, start, end);
        }
        swap(strs, start, left);
        return start;
    }

    private void swap(String[] strs, int i, int j) {
        String temp = strs[i];
        strs[i] = strs[j];
        strs[j] = temp;
    }

}
