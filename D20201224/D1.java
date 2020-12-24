package D20201224;


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 请定义一个队列并实现函数 max_value 得到队列里的最大值，
 * 要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
 *
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */
public class D1 {

    class MaxQueue {

        public Queue<Integer> x;
        public Deque<Integer> y;

        public MaxQueue() {
            x = new LinkedList<>();
            y = new LinkedList<>();
        }

        public int max_value() {
            if ( y.isEmpty() ) {
                return -1;
            }
            return y.peekFirst();

        }

        public void push_back(int value) {
            while ( !y.isEmpty() && y.peekLast() < value ) {
                y.pollLast();
            }
            y.offerLast(value);
            x.offer(value);
        }

        public int pop_front() {
            if( x.isEmpty() ) {
                return -1;
            }
            int ret = x.poll();
            if( ret == y.peekFirst() ) {
                y.pollFirst();
            }
            return ret;

        }
    }

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
}
