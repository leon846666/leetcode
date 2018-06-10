package leetcode.solution.string;

public class ReverseString {
	/**
	 *  Question : 344. Reverse String
	 *  Category: 	String    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 *	Description:
	 *  Write a function that takes a string as input and returns the string reversed.
	 *	Example:
	 *	Given s = "hello", return "olleh".
	 * */
	
	 public static String reverseString(String s) {
	      StringBuilder sb = new StringBuilder();
	        for(int i=s.length()-1;i>=0;i--){
	            sb.append(s.charAt(i));
	        }
	        return sb.toString();
	    }
	 public static void main(String[] args) {
		 String string = "hello";
		 System.out.println(reverseString(string));
		 
	 }
}
