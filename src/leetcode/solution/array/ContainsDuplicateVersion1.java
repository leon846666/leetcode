package leetcode.solution.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContainsDuplicateVersion1 {
	/**
	 *  Version 1:
	 *  Runtime :30ms
	 *  Question :	217. Contains Duplicate
	 *  Category: 	Array    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 * 
	 * 	Given an array of integers, find if the array contains any duplicates.
		
	 *	Your function should return true if any value appears at least twice in the array, 
	 *	and it should return false if every element is distinct.
	 *	Example 1:
		Input: [1,2,3,1]
		Output: true
	 *	Example 2:
		Input: [1,2,3,4]
		Output: false
	 *	Example 3:
		Input: [1,1,1,3,3,4,3,2,4,2]
		Output: true
	 * */
	public static boolean findMajorityElement( int []nums) {
		        Map<Integer, Integer> map = new HashMap<>();
		       for (int i = 0; i < nums.length; i++) {
		    	   map.put(nums[i], nums[i]);
			}
		       if (map.size()<nums.length) {
				return true;
			}else{
				 
		        return false;
			}
		       
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={2,2,1,1,1,2,2};
		System.out.println(findMajorityElement(nums));
	}

}
