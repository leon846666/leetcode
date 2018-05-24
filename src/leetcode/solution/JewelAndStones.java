package leetcode.solution;

public class JewelAndStones {

	/**
	 *  Question : 771 JewelAndStones
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 * */
	static class Solution{
	
		public static int findJewels(String jewels,String stones) {
			int counter= 0;
			for (int i = 0; i < stones.length(); i++) {
				Character character = stones.charAt(i);
				
				if(jewels.contains(character.toString())){
					counter++;
				}
			}
			
			
			return counter;
		}
	}
	
	public static void main(String[] args) {
		
		int result = Solution.findJewels("aA", "aAAbbbb");
		
		System.out.println(result);
	}
	
	
}
