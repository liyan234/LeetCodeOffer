package D20210212;

import java.util.HashMap;

public class D1 {
    public int singleNumber(int[] nums) {

        //特殊情况
        if (nums.length == 1) {
            return nums[0];
        }
        //HashMap
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        //将其存入哈希表中，含义为，若该元素不存在则存入表中，并计数为1，若已经存在获取次数并加1.
        for (int x : nums) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1 );
            } else {
                map.put(x, 1);
            }
            // map.put(x , map.getOrDefault(x,0) + 1);
        }
        //遍历出出现次数为1的情况
        for (int y : map.keySet()) {
            if(map.get(y) == 1){
                return y;
            }
        }
        return 0;
    }
}
