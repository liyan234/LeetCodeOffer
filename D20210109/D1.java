package D20210109;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class D1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        List<List<Integer>> list = new ArrayList<>();
        while ( !queue.isEmpty() ) {
            LinkedList<Integer> x = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size ; i++) {
                TreeNode node = queue.poll();
                if (list.size() % 2 == 0) {
                    x.add(node.val);
                } else {
                    x.addFirst(node.val);
                }
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            list.add(x);
        }
        return list;
    }
}
