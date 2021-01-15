package D20210115;

public class D2 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = help(root.left);
        int right = help(root.right);
        if (left > right) {
            int tmp = left;
            left = right;
            right = tmp;
        }
        return (right - left) < 2 && isBalanced(root.right) && isBalanced(root.left);
    }
    public int help(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(help(root.left), help(root.right)) + 1;
    }
}
