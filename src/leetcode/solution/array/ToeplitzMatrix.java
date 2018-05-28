package leetcode.solution.array;

public class ToeplitzMatrix {
	/**
	 *  Question : 766. Toeplitz Matrix
	 *  Category: 	Array    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 * */
	
	class Solution{
		public boolean isToeplitzMatrix(int[][] matrix) {
			/**
			    1 2 3 4
				5 1 2 3
				9 5 1 2
			 * */
			 for(int i =1; i < matrix.length; i++) {
			        for(int j = 1; j < matrix[i].length; j++) {
			            if(matrix[i - 1][j - 1] != matrix[i][j]) {
			                return false;
			            }
			        }
			    }
			    return true;
						
			    }
			
		
		}


	public static void main(String[] args) {
		 int [][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		Solution solution = new ToeplitzMatrix().new Solution();
		boolean toeplitzMatrix = solution.isToeplitzMatrix(matrix);
		System.out.println(toeplitzMatrix);
	}
}

