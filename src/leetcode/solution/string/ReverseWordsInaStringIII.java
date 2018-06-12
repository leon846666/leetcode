package leetcode.solution.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReverseWordsInaStringIII
 {
	/**
	 *  Runtime :22ms
	 *  Question :	557. Reverse Words in a String III
	 *  Category: 	Array    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 * 
	 * Given a string, you need to reverse the order of characters in each word within a 
	 * sentence while still preserving whitespace and initial word order.
		
		Example 1:
		Input: "Let's take LeetCode contest"
		Output: "s'teL ekat edoCteeL tsetnoc"
	 * */
	 public static String reverseWords(String s) {
		 StringBuilder sBuilder = new StringBuilder();
		 String[] strings = s.split(" ");
		 
		 for (int i = 0; i < strings.length; i++) {
			for (int j = strings[i].length()-1; j >=0 ; j--) {
				sBuilder.append(strings[i].charAt(j));
				
			}
			if(i<strings.length-1){
				
					sBuilder.append(" ");
			}
		}
	        
		 return sBuilder.toString();
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="Let's take LeetCode contest";
		System.out.println(reverseWords(string));
	}

}
