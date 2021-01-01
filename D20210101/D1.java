package D20210101;


/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 * */

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class D1 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode node = head;
        ListNode pre = null;
        while (node != null) {
            if (node.val == val) {
                pre.next = node.next;
                break;
            }
            pre = node;
            node = node.next;
        }
        return head;
    }
}
