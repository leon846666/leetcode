package leetcode.solution;

import java.util.HashSet;

public class UniqueMorseCodeWords {

	
	/**
	 *  Question : 804.Unique Morse Code Words     
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 * */
	static class Solution{
		
		public static int uniqueMorseCode(String [] words) {
			
			int count=0;
			
			String []wordsMorse={".-","-...","-.-.","-..",".","..-.","--.","....",
					"..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
			
			//Solutions.uniqueMorseCode(words);
			String result="";
			for (int j = 0; j < words.length; j++) {
				for (int i = 0; i < words[j].length(); i++) {
					result+= Solution.findAscCode(words[j].charAt(i),wordsMorse);
					
				}
				if(j!=words.length-1){
					result+="/";
				}
				
			}

			//System.out.println(result);
			
			String [] morseCodewords=result.split("/");
			//System.out.println(morseCodewords.length);
			if(words==null || (words!=null && words.length==0) ){

				count=0;
				return count;
			}
			else if(morseCodewords.length==1){
				count=1;
				
			}else{
				HashSet<String> hashSet= new HashSet<String>();
				for (int i = 0; i < morseCodewords.length; i++) {
				
					hashSet.add(morseCodewords[i]);
				}
			count=hashSet.size();
			}
			//System.out.println(count);
			return count;
		}
		
		public static String findAscCode (Character c,String[] wordsMorse) {
			
			for (int i =0; i <wordsMorse.length ; i++) {
				if(Integer.valueOf(c)-97==i){
					return wordsMorse[i];
				}
			} 
			return "";
		}
		
		
	}
	
	public static void main(String[] args) {
	
		String []words = {"yxmine","yxzd","eljys","uiaopi","pwlk"};
		int uniqueMorseCode = Solution.uniqueMorseCode(words);
		System.out.println(uniqueMorseCode);
		
	}
	
}
