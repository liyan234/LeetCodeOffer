package D20201216;

import java.util.HashMap;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class D5 {
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null) {
            return null;
        }
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helpBuilder(0 , preorder.length, preorder, 0, inorder.length, inorder);
    }

    public TreeNode helpBuilder(int start, int end, int[] preorder,int left , int right, int[] inorder) {
        if (start >= end) {
            return null;
        }
        int val = preorder[start];
        // 前序遍历的开始 是根结点
        TreeNode node = new TreeNode(preorder[start]);
        // 获取根节点在那个位置
        int index = map.get(preorder[start]);
        // 获取根据index的位置 获取左边应该由几个数
        int num = index - left;
        // 左子树
        node.left = helpBuilder(start + 1, start + num + 1,  preorder, left ,index + 1, inorder);
        // 右子树
        node.right = helpBuilder(start + num + 1, end, preorder, index + 1, right, inorder);
        return node;

    }

}
