package leetcode.solution.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayPartitionI {
	/**
	 *  Question : 561. Array Partition I
	 *  Category: 	Array    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 * */
	 class Solution{
		 public int arrayPairSum(int[] nums) {
		   Arrays.sort(nums);
		   int sum=0;
		  for (int i = 0; i < nums.length; i+=2) {
			sum+=nums[i];
		} 
		   
			 return sum;
		    }
	}
	
	public static void main(String[] args) {
		int []nums={1,4,3,2};
		Solution solution  =new ArrayPartitionI(). new Solution();
		int arrayPairSum =	solution.arrayPairSum(nums);
		System.out.println(arrayPairSum);
	}
}
