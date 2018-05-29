package leetcode.solution.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxConsecutiveOnes {
	/**
	 *  Question : 485.Max Consecutive Ones
	 *  Category: 	Array    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 * */
	
	class Solution{
		 public int findMaxConsecutiveOnes(int[] nums) {
			  if (nums == null || nums.length == 0) {
			        return 0; 
			    }
			    int max = 0; 
			    int count = 0; 
			    
			    for (int i = 0; i < nums.length; i++) {
			        if (nums[i] == 1) {
			            count++; 
			        } else {
			            count = 0; 
			        }
			        max = Math.max(max, count); 
			    }
			    return max; 	
		}
	}

	public static void main(String[] args) {
		 int [] nums =  {0,0};
		Solution solution = new MaxConsecutiveOnes().new Solution();
	int result= solution.findMaxConsecutiveOnes(nums);
		System.out.println(result);
	}
}

