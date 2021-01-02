package D20210102;


 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


  /**
   * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
   * */
public class D1 {

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        helpBuilder(root);
        return root;
    }
    public TreeNode helpBuilder (TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode node = root.left;
        root.left = helpBuilder(root.right);
        root.right = helpBuilder(node);
        return root;
    }
}
