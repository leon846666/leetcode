package leetcode.solution.array;

import java.util.Arrays;
import java.util.List;

public class JudgeRouteCircle {
	/**
	 *  Question : 657. Judge Route Circle
	 *  Category: 	Array    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 * */
	
	class Solution{
		public boolean judgeCircle(String moves) {
			 int sum=0;
	        for (int i = 0; i < moves.length(); i++) {
	        	
				System.out.println();
				if(moves.charAt(i)=='U'||moves.charAt(i)=='R'){
					sum+=1;
				}else{
					sum+=-1;
				}				
			}
	        
	        if(sum==0)return true;
	        else{
	        	return false;
	        }
	    }
	}
	
	public static void main(String[] args) {
		Solution solution = new JudgeRouteCircle().new Solution();
		System.out.println(solution.judgeCircle("UD"));
	}
}
