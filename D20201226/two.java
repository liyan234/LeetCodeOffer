package D20201226;


/**
 * 给定一个整形数组，给一个目标数n,求出这个数组中一共有多少组两个数字和是n的，
 * */
public class two {

   public static int haveNum(int[] nums, int k) {
       int len = nums.length;
       int count = 0;
       for (int i = 0; i < len - 1; i++) {
           for (int j = i + 1; j < len; j++) {
               if(nums[i] + nums[j] == k) {
                   count++;
               }
           }
       }
       return count;
   }

    public static void main(String[] args) {
       int x = haveNum(new int[]{1,3,2,4,1,2,0}, 3);
        System.out.println(x);
    }

}
