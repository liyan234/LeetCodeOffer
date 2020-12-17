package D20201217;


/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，
 * 我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，
 * 输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该
 * 数组的最小值为1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */
public class D1 {

    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length-1;
        int x = 0;
        while (low < high) {
            x = (low + high) / 2;
            if (numbers[x] < numbers[high]) {
                high = x;
                // 中间的小于最右边的
                // 然后中间的成为最右边的
            } else if (numbers[x] > numbers[high]) {
                low = x + 1;
                // 中间的大于最右边的
                // 中间的+1 成为最左边的 因为知道中间的不可能是最小的 所以加1
            } else {
                // 当中间的和最右边的相等的时候
                // 最右边的减一 再进行比较
                // 得到的结果 可能再进行二分 或者是 low和high重逢
                // low 和 high 重逢的时候 就获得了最小值
                high--;
            }
        }
        return numbers[low];

        /**
         *   46789 123  len = 8
         *   1. low = 下标0(值4)  high = 8 (3)  mid = 4 (8)  8 > 3
         *   2. low = 5(9)  high = 8 (3)  mid = 6 (1)  1 < 3
         *   3. low = 5(9)  high = 6 (1)  mid = 5 (9)  9 > 1
         *   low = mid+1 = 5 + 1 = 6 ==> 得到值是1
         * */
    }
}
