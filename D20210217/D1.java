package D20210217;

import java.util.HashSet;
import java.util.Set;

public class D1 {
    public boolean isStraight(int[] nums) {
        // 随机抽五张牌
        Set<Integer> ret = new HashSet<>();
        int max = -1;
        int min = 14;
        for (int i = 0; i < 5; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (ret.contains(nums[i])) {
                return false;
            }
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
            ret.add(nums[i]);
        }
        if (max - min >= 5) {
            return false;
        }
        return true;
    }
}
