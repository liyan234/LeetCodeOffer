package D20201216;


import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */

//1. 借助栈来解决 先入栈 再出栈
//2. 遍历结点 获取长度 然后 创建一个长度和这个结点一样长的数组
//    数组从后面  然后从头遍历数组
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class D4 {

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur.val);
            cur = cur.next;
        }
        int len = stack.size();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = stack.pop();
        }
        return nums;
    }
}
