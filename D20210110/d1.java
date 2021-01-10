package D20210110;


/**
 *输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。
 * 如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 * */
public class d1 {
    public boolean verifyPostorder(int[] postorder) {
        // 二叉搜索树 左子树小于 根节点  右子树大于根结点
        return recur(postorder, 0, postorder.length-1);
    }

    public boolean recur(int[] order, int left, int right) {
        if (left >= right) {
            return true;
        }
        int x = left;
        while (order[x] < order[right]) {
            x++;
        }
        int m = x;
        while (order[x] > order[right]) {
            x++;
        }
        return x == right && recur(order , left, x-1) && recur ( order, x, right);
    }
}
