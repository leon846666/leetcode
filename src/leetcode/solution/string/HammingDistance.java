package leetcode.solution.string;

public class HammingDistance {

	static class Solution{
		/**
		 *  Question : 461. Hamming Distance
		 * 	Level : 	Easy
		 * 	Result: 	Accepted
		 * 	Author: 	Yang Liu
		 * */
		  static public int hammingDistance(int x, int y) {
			  	String xString= Integer.toBinaryString(x);
				System.out.println(xString);
				
				
				 String yString= Integer.toBinaryString(y);
				 System.out.println(yString);
				 
				 int difference= Math.abs(yString.length()-xString.length());
					
				 
				 int counter=0;
				 if (xString.length()>yString.length()) {
					for (int i = 0; i < difference; i++) {
						yString="0"+yString;
					}
					System.out.println(yString);
					 for (int i =  yString.length()-1; i >=0; i-- ){
							if (xString.charAt(i)==yString.charAt(i)) {
								counter++;
							}
						}
					 return xString.length()-counter;
				}else{
					for (int i = 0; i < difference; i++) {
						xString="0"+xString;
					}
					System.out.println(xString);
					
					 for (int i = xString.length()-1; i >=0; i--) {
							if (xString.charAt(i)==yString.charAt(i)) {
								counter++;
							}
						}
				}
				
				 return yString.length()-counter;
			  
		   }
		
			
		  public static void main(String[] args) {
			
			  int hammingDistance = hammingDistance(4,14);System.out.println(hammingDistance);
		}
	}
}
