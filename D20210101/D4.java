package D20210101;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 反转链表
 * */
public class D4 {
    public ListNode reverseList(ListNode head) {
        // 利用两个指针来实现局部反转
        ListNode cur = head;
        ListNode pre = null;
        while ( cur != null) {
            // 来保存和后面的
            ListNode temp = cur.next;
            // 让当前的结点指向前面的
            cur.next = pre;
            // 改变头结点
            pre = cur;
            // 进位
            cur = temp;
        }
        return pre;

    }

}
