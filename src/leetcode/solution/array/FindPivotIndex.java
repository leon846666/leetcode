package leetcode.solution.array;

/**
 * @Author : Yang
 * @Date :  2023/3/1 15:33
 * @Description：
 */
public class FindPivotIndex {
    static class Solution {

        public static int findPivotIndex(int[] nums) {
            int sum = 0;
            int sumLeft = 0;
            for (int i = 0; i < nums.length; i++) sum += nums[i];

            for (int i = 0; i < nums.length; i++) {
                if (sumLeft == sum - sumLeft - nums[i]) return i;
                sumLeft += nums[i];
            }

            return -1 ;
        }
    }

    public static void main(String[] args) {
        int[] arr2 = {2,1,-1};
        int ints = Solution.findPivotIndex(arr2);
        System.out.println(ints);
    }
}
