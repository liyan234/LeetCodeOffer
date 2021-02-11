package D20210211;


import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class D2 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        Node cur = head;
        Map<Node, Node> map = new HashMap<>();

        // 原结点到新节点的映射
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        // 新节点的指针指向
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        // 返回新节点的指向位置
        return map.get(head);
    }
}
