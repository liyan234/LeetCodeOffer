package D20201219;

import java.util.Stack;


/**
 * 定义栈的数据结构，
 * 请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
 * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * */
public class D1 {

    class MinStack {

        public Stack<Integer> satckA;
        public Stack<Integer> satckB;
        /** initialize your data structure here. */
        public MinStack() {
            satckA = new Stack();
            satckB = new Stack();
        }

        public void push(int x) {
            satckA.push(x);
            if(satckB.empty() || (satckB.peek() > x)) {
                satckB.push(x);
            } else {
                satckB.push(satckB.peek());
            }
        }

        public void pop() {
            satckA.pop();
            satckB.pop();
        }

        public int top() {

            return satckA.peek();
        }

        public int min() {
            return satckB.peek();
        }
    }

}
