package D20210115;


/**
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。
 *请写程序找出这两个只出现一次的数字。
 * 要求时间复杂度是O(n)，空间复杂度是O(1)。
 * */
public class D3 {

    public int[] singleNumbers(int[] nums) {
        // 用异或来解决
        // 相同为0 相异为1

        // 两个出现了一次的相互异或
        // 保存所有异或的值
        int x = 0;
        for (int num : nums) {
            x ^= num;
        }
        // 找到异或时候那个不同位
        // 就是两个什么时候按二进制来说的那一位是不同的
        int y = 1;
        // & 且
        // 相同为1 找出异或结果的中的 1
        while ( (x & y) == 0) {
            // 左移一位
            y <<= 1;
        }
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & y) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a,b};
    }
}
