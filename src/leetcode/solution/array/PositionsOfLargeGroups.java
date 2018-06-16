package leetcode.solution.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;import javax.management.ImmutableDescriptor;

public class PositionsOfLargeGroups {

	/** 
	 *  Runtime: 19ms
	 *  Question :	830. Positions of Large Groups
	 *  Category: 	Array    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 *  In a string S of lowercase letters, these letters form consecutive groups of the same character.
		For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".
		Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.
		The final answer should be in lexicographic order.
		Example 1:
		
		Input: "abbxxxxzzy"
		Output: [[3,6]]
		Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
		Example 2:
		
		Input: "abc"
		Output: []
		Explanation: We have "a","b" and "c" but no large group.
		Example 3:
		
		Input: "abcdddeeeeaabbbcd"
		Output: [[3,5],[6,9],[12,14]]
	 * */
	 public static List<List<Integer>> largeGroupPositions(String S) {
	     int counter= 1;
	     List<List<Integer>> listInt= new ArrayList<>();
	     List<Integer> list=new ArrayList<>();
	     for (int i = 1; i <= S.length(); i++) {
	    	
			if((S.length()>i)&&S.charAt(i-1)==S.charAt(i)){
				counter++;
				if(counter==3){
					
					list.add(i+1-counter);
				}
			}
			else{
				if(counter>=3){
					list.add(i-1);
					 if(list.size()>0){
						   listInt.add(list);
						   list=new ArrayList<>();
					   }
				}
				counter=1;
			}
		}
	  
	  
	   
		 return listInt;
	    }
	
	public static void main(String[] args) {
		String string = "aaa";
		List<List<Integer>> list = largeGroupPositions(string);
		for (List<Integer> list2 : list) {
			for (Integer integer : list2) {
				System.out.println(integer);
			}
		}
		
	}
}
