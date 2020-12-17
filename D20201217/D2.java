package D20201217;



/**
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。
 * 如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 * 例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
 *
 * [["a","b","c","e"],
 * ["s","f","c","s"],
 * ["a","d","e","e"]]
 *
 * 但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，
 * 路径不能再次进入这个格子。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * */
public class D2 {

    public boolean exist(char[][] board, String word) {
        char[] chs = word.toCharArray();
        // 行的长度
        for (int i = 0; i < board.length; i++) {
            // 列的长度
            for (int j = 0; j < board[0].length; j++) {
                if (helpSearch (board, chs, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean helpSearch(char[][] board, char[] chs, int i,  int j, int k) {
        if ( i >= board.length || j >= board[0].length || i < 0 ||
                j < 0 || board[i][j] != chs[k] ) {
            return false;
        }
        // 遍历完毕
        if (k == chs.length - 1) {
            return true;
        }
        board[i][j] = ' ';
        boolean ret = helpSearch(board, chs, i+1, j, k+1) || helpSearch(board, chs, i, j+1,k+1) || helpSearch(board, chs, i-1, j, k+1) || helpSearch(board, chs, i, j-1, k+1);

        board[i][j] = chs[k];
        return ret;
    }
}
