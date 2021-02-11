package D20210211;


class LNode {
    public int val;
    public LNode left;
    public LNode right;

    public LNode() {}

    public LNode(int _val) {
        val = _val;
    }

    public LNode(int _val,LNode _left,LNode _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
public class D3 {
    class Solution {
        public LNode pre;
        public LNode head;

        // left 为前驱结点
        // right 为后驱结点
        public LNode treeToDoublyList(LNode root) {
            // 空间复杂度为O(1)的
            // 二叉搜索树的特性就是 左小右大
            // 遍历的话就需要左中右
            if (root == null) {
                return null;
            }
            dfs(root);
            // 遍历结束后 pre就是最右边的结点 也是最大的
            // 而 head 就是最左边的结点 也是最小的
            // 我们需要构成一个闭环
            pre.right = head;
            head.left = pre;
            return head;
        }

        public void dfs(LNode cur) {
            if (cur == null) {
                return;
            }
            // 先左节点
            dfs(cur.left);
            if (pre != null) {
                // pre 为前结点
                pre.right = cur;
            } else {
                // pre为null 的时候 遍历第一个左结点
                // 记录刚开始的结点
                head = cur;
            }
            // 前面是pre
            cur.left = pre;
            pre = cur;

            // 后右节点
            dfs(cur.right);

        }
    }
}
