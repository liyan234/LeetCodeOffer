package D20210101;


/**
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，
 * 本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。
 * 这个链表的倒数第3个节点是值为4的节点
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class D3 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        // 双指针获取倒数第k个结点
        ListNode pre = head;
        ListNode cur = head;
        // 前面的走 k 步
        // 然后前面的后面的一起走
        // 前面的 走到头了
        // 后面的就是倒数第k个结点
        for (int i = 0; i < k; i++) {
            pre = pre.next;
        }
        while ( pre != null) {
            pre = pre.next;
            cur = cur.next;
        }
        return cur;

    }
}
