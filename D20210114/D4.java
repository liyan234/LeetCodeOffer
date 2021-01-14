package D20210114;

import java.util.ArrayList;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


/**
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 * */
public class D4 {

    public int kthLargest(TreeNode root, int k) {
        // 二叉搜索树 左大右小
        ArrayList<TreeNode> list = new ArrayList<>();
        dfs(list, root);
        return list.get(k - 1).val;
    }

    public void dfs(ArrayList list, TreeNode root) {
        // 左中右
        // 右中左
        if (root == null) {
            return;
        }
        dfs(list, root.right);
        list.add(root);
        dfs(list, root.left);

    }
}
