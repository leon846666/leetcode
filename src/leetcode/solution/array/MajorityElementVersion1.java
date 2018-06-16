package leetcode.solution.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElementVersion1 {
	/**
	 *  version 1:
	 * 	Runtime: 48ms
	 *  Question :	169. Majority Element
	 *  Category: 	Array    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 * 
	 * 	Description:
	 *	Given an array of size n, find the majority element. The majority element is the element that
	 *  appears more than ⌊ n/2 ⌋ times.

		You may assume that the array is non-empty and the majority element always exist in the array.
		
		Example 1:
		
		Input: [3,2,3]
		Output: 3
		Example 2:
		
		Input: [2,2,1,1,1,2,2]
		Output: 2

	 * */
	public static int findMajorityElement( int []nums) {
		        Map<Integer, Integer> map = new HashMap<>();
		        if(nums.length<2){
		            return nums[0];
		        }
				Arrays.sort(nums);
				for (int i = 0; i < nums.length; i++) {
					int count =1;
					if(null!=map.get(nums[i])){
						 count=map.get(nums[i]);
					}
						if(i+1<nums.length&&nums[i]==nums[i+1]){
							count++;
							map.put(nums[i], count);
					}else {
						count=1;
					}
				}
				for(Integer key :map.keySet()){
					if(nums.length/map.get(key)<2){
						return key;
					}
				}
				return -1;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={2,2,1,1,1,2,2};
		System.out.println(findMajorityElement(nums));
	}

}
