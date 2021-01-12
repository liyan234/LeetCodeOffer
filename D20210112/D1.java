package D20210112;

public class D1 {
    public int reversePairs(int[] nums) {
        // 其实用两个for 循环就可以直接解决这个问题
        // 但是用归并排序的做法其实能更好的实现解决这个问题
        // 时间复杂度更低
        int len = nums.length;
        if (len < 2) {
            return 0;
        }
        // 做一个辅助的数组
        int[] copy = new int[len];
        for (int i = 0; i < len; i++) {
            copy[i] = nums[i];
        }
        // 归并排序的时候也需要一个辅助的数组
        // 我们置为空就可以了
        int[] temp = new int[len];
        // 用一个方法来返回我们的判断
        return retReverseNum(copy, 0, len - 1, temp);

    }
    private int retReverseNum(int[] copy, int left, int right, int[] temp) {
        if (left == right) {
            return 0;
        }
        //
        int mid = left + (right - left) / 2;
        // 递归左边
        int leftNums = retReverseNum(copy, left, mid, temp);
        // 右边
        int rightNums = retReverseNum(copy, mid + 1, right, temp);
        // 其实最终有个排序的过程
        // 我们 判断一下是否左边的和右边的 是否 是 递增的
        // 如果是递增的话 我们就不用再去加逆序对的个数了
        if (copy[mid] <= copy[mid+1]) {
            return leftNums + rightNums;
        }
        // 用来计算左右两边的逆序对数 并且进行排序
        int corssNums = helpCount(copy, left, mid, right, temp);
        return corssNums + leftNums + rightNums;
    }
    private int helpCount(int[] copy, int left, int mid, int right, int[] temp) {
        int count = 0;
        int start = left;
        int among = mid + 1;
        // 归并排序的辅助数组
        // 为了进行排序
        for (int i = left; i <= right; i++) {
            temp[i] = copy[i];
        }
        // 归并排序
        for (int j = left; j <= right; j++) {
            if (start == mid + 1) {
                // 前面的走到中间了
                // 然后直接赋后面的值
                copy[j] = temp[among];
                among++;
            } else if (among == right + 1) {
                // 后面的完了
                // 然后赋前面的值
                copy[j] = temp[left];
                start++;
            } else if (temp[start] <= temp[among]) {
                // 后面的大于前面的
                // 然后吧前面赋值
                copy[j] = temp[start];
                // start++ 之后 这个循环执行完毕
                // 就会等于among 下一次的循环就会把后面的也给变了

                start++;
            } else {
                // 这个就是后面的小于前面的
                // 把后面的赋值

                copy[j] = temp[among];
                among  ++;

                //因为都是排序好的 所以count 可以直接加了
                count = count + (mid - start + 1) ;
            }
        }
        return count;

    }


}
