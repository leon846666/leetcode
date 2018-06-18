package leetcode.solution.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DegreeOfAnArray {

	/** 
	 *  Runtime: 
	 *  Question :	697 Degree of an Array
	 *  Category: 	Array    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 * 	Description:
	 *	Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
		
		Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.
		
		Example 1:
		Input: [1, 2, 2, 3, 1]
		Output: 2
		Explanation: 
		The input array has a degree of 2 because both elements 1 and 2 appear twice.
		Of the subarrays that have the same degree:
		[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
		The shortest length is 2. So return 2.
		Example 2:
		Input: [1,2,2,3,1,4,2]
		Output: 6
		Note:
		
		nums.length will be between 1 and 50,000.
		nums[i] will be an integer between 0 and 49,999.
		
	 * */
	 public static int findShortestSubArray(int[] nums) {
		     Map<Integer,ArrayList<Integer>>   hashMap  = new HashMap<>();
		     
		     for (int i = 0; i < nums.length; i++) {
		    	 int key =nums[i];
		    	 ArrayList<Integer> list = new ArrayList<>();
				if (null!=hashMap.get(key)) {
					list=hashMap.get(key);
					list.add(i);
					hashMap.put(key, list);
				}else{
					list.add(i);
					hashMap.put(key, list);
				}
			}
		     int max = 0;
		
		     Integer collect = hashMap.entrySet().stream()
		 	.filter(map -> map.getValue().size()>1)
			.max(Map.Entry.comparingByKey()).get().getKey();
	
		     ArrayList<Integer> arrayList = hashMap.get(collect);
		     
		    max=arrayList.get(arrayList.size()-1)-arrayList.get(0)+1;
		 
			 return max;
	    }
	public static void main(String[] args) {
		int[] nums={1,2,2,3,1,4,2};
		
		findShortestSubArray(nums);
	}
}
