package leetcode.solution.array;

import java.util.ArrayList;

public class ReshapeTheMatrix {
	/**
	 *  Question : 566.Reshape The Matrix
	 *  Category: 	Array    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 * */
	class Solution {
	    public int[][] matrixReshape(int[][] nums, int r, int c) {
	    	ArrayList<Integer> list = new ArrayList<Integer>();
		      for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums[i].length; j++) {
					list.add(nums[i][j]);
				}
			}
		      System.out.println(list.size());
		      if (r*c== list.size()) {
		    	 int listIndex =0;
				int [][] newNums=new int[r][c];
				for (int i = 0; i < newNums.length; i++) {
					for (int j = 0; j < list.size()/r; j++) {
						newNums[i][j]=list.get(listIndex);
						listIndex++;
					}
				}
				return newNums;
			}
		    	return nums;
		    }
		    
	    
	    
	}
	public static void main(String[] args) {
		Solution solution  = new ReshapeTheMatrix(). new Solution();
		int nums[][]={{1,2},{3,4}};
		int r = 2;
		int c = 4;
		int[][] matrixReshape = solution.matrixReshape(nums, r, c);
		printTwo(matrixReshape);

	}
	private static void printTwo(int arr[][]) {  
        for (int i = 0; i < arr.length; i++) {  
            for (int j = 0; j < arr[i].length; j++) {  
                System.out.print(arr[i][j] +" ");  
            }  
            System.out.println();  
        }  
    } 
	
}
