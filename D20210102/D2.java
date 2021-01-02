package D20210102;


/**
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。
 * 如果一棵二叉树和它的镜像一样，那么它是对称的。
 * */
public class D2 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return judge(root.left, root.right);
    }
    public boolean judge(TreeNode le, TreeNode ri) {
        if (le == null && ri == null) {
            return true;
        }
        if (le == null || ri == null || le.val != ri.val) {
            return false;
        }
        return judge(le.left, ri.right) && judge(le.right, ri.left);
    }
}
