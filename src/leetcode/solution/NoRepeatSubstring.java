package leetcode.solution;

import java.util.HashSet;
import java.util.Set;


/**
 *  Question : 3. Longest Substring Without Repeating Characters
 * 	Level : 	Medium
 * 	Result: 	Time Limit Exceeded
 * 	Author: 	Yang Liu
 * */	
public class NoRepeatSubstring {
	static class Solution {
	    public static int lengthOfLongestSubstring(String s) {
	    	int ans=0;
	    	for (int i = 0; i < s.length(); i++) 
	    		for (int j = i+1; j <=s.length(); j++) 
	    			if(allUnique(s,i,j)) ans=Math.max(ans, j-i);
			return ans;
	   
	    }
	    
	    public static boolean allUnique(String s, int start,int end) {
			Set<Character>container = new HashSet<Character>();

	    	for (int i = start; i < end; i++) {
				char c = s.charAt(i);
				
				if(container.contains(c)) return false;
				
				container.add(c);
			}
	    	return true;
	    }
	    
	}
	
	public static void main(String[] args) {
		System.out.println(Solution.lengthOfLongestSubstring("dasddd"));
	}
}
