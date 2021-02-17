package D20210217;

public class D3 {
    public static int maxProfit(int[] prices) {
        // 不可以前面减后面的得到最大的利润
        // 必须从后面减去前面的
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        int x = maxProfit(nums);
        System.out.println(x);
    }
}
