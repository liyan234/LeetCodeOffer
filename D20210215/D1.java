package D20210215;

import java.util.Deque;
import java.util.LinkedList;

public class D1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0 || nums.length == 0 ) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<Integer>();
        // 每滑动一次 中的最大值
        int[] res = new int[nums.length - k + 1];
        // 形成滑动窗口
        for (int i = 0; i < k ;i++) {
            // 如果nums[i] 大于队列末尾的数 ，删除队列末尾的数
            // 这个其实加入第一个就开始判断了
            while(!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        // 滑动窗口已经形成
        // 第一个其中的最大值
        res[0] = deque.peekFirst();
        for (int i = k; i < nums.length; i++) {
            // 如果取出的第一个数等于超出了滑动窗口的的范围
            if(deque.peekFirst() == nums[i - k]) {
                deque.removeFirst();
            }
            while(!deque.isEmpty() && deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }
        return res;

    }
}
