package leetcode.solution;

/**
 * @Author : Yang
 * @Date :  2023/3/1 15:33
 * @Description：
 */
public class RunningSum {
    static class Solution {

        public static int[] runningSum(int[] nums) {
            int [] newArrr  = new int[nums.length];
            newArrr[0] = nums[0];
            for(int i = 1;i<nums.length;i++){
                newArrr[i] = nums[i]+newArrr[i-1];
            }
            return  newArrr;
        }
    }

    public static void main(String[] args) {
        int [] arr ={0,1,2,3};
        int [] arr2 ={1,2,3,4};
        int[] ints = Solution.runningSum(arr2);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
