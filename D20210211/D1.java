package D20210211;

import java.util.LinkedList;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class D1 {
    LinkedList<List<Integer>> list = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return list;
    }

    public void recur(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        sum -= root.val;
        if (sum == 0 && root.left == null && root.right == null) {
            list.add(new LinkedList(path));
        }
        recur(root.left, sum);

        recur(root.right, sum);

        path.removeLast();
    }
}
