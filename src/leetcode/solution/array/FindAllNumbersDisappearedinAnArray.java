package leetcode.solution.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAllNumbersDisappearedinAnArray {

	/**
	 *  Question :	448. Find All Numbers Disappeared in an Array
	 *  Category: 	Array    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 * 	Description:
	 *	Given an array of integers where 1 ¡Ü a[i] ¡Ü n (n = size of array), some elements appear twice 
	 *	and others appear once.

		Find all the elements of [1, n] inclusive that do not appear in this array.
		
		Could you do it without extra space and in O(n) runtime? You may assume the returned list does 
		not count as extra space.
		
		Example:
		
		Input:
		[4,3,2,7,8,2,3,1]
		
		Output:
		[5,6]
		
	 * */
	public static List<Integer> findAllNumbersDisappearedinAnArray (int[] nums) {
		/*List<Integer> list=IntStream.of(nums).boxed().collect(Collectors.toList());
		Map<Integer,List<Integer>>map=list.stream().collect(Collectors.groupingBy(u->u.intValue()));
		
        List<Integer> num=new ArrayList<Integer>();
       for(int i=1;i<=nums.length;i++){
           if(map.get(i)==null){
              num.add(i); 
           }
       }*/
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i] ,nums[i] );
		}
		for (Integer integer : map.keySet()) {
			
			System.out.println(integer);
		}
		
		for (int i = 1; i <= nums.length; i++) {
			if(map.get(i)==null){
				list.add(i);
			}
		}
		
       return list;
		
		
		
	}
	
	public static void main(String[] args) {
		int[] nums={4,3,2,7,8,2,3,1};
		
		List<Integer> list2 = findAllNumbersDisappearedinAnArray(nums);
		for (Integer integer : list2) {
			
			System.out.println(integer);
		}
	}
}
