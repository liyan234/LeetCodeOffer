package D20210101;


/**
 * 输入两个递增排序的链表，
 * 合并这两个链表并使新链表中的节点仍然是递增排序的。
 * */
public class D5 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if ( l1 == null ) {
            return l2;
        }
        if (l2 == null ) {
            return l1;
        }

        // 创建一个头节点
        ListNode node = null;
        if ( l1.val < l2.val) {
            node = l1;
            l1 = l1.next;
        } else {
            node = l2;
            l2 = l2.next;
        }
        ListNode cur = node;

        while ( l1 != null && l2 != null) {
            while (  l1 != null && l2 != null && l1.val < l2.val ) {
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }
            while ( l1 != null && l2 != null && l1.val >= l2.val ) {
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        if( l1 != null) {
            cur.next = l1;
        } else {
            cur.next = l2;
        }
        return node;

    }
}
