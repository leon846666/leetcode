package leetcode.solution;

import java.util.ArrayList;

public class ImageReverse {

	static class Solution{
		public static int[][] imageReverse() {
			
			return new int[1][3];
		}
		public static void main(String[] args) {
		//	String a="10100111";
			int a[][] = {{1,1,0},{1,0,1},{0,0,0}};
			//System.out.println(a.length);
		
			 a = dimensionAarrayReverse(a);
			
			 for (int []i : a) {
				for (int j = 0; j < i.length; j++) {
					System.out.println(i[j]);
				}
			}
		}
		
		public static String stringReverse (String s) {
		
			if(s==null||s.length()<2) return s;
			
			return stringReverse(s.substring(1))+s.charAt(0);
		}
		
		public static ArrayList<Integer> arrayReverse (int s[]) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = s.length-1; i >=0; i--) {
				list.add(s[i]);
			}
			return list;
		}
	
		public static int [][] dimensionAarrayReverse (int s[][]) {
			
				int [][] arr =new int[s.length][s[0].length];
		
				for (int i =0; i <s.length; i++) {
					int q= s[i].length-1; //q 2 j 2 index 0, q 2  j1 index 1
					for (int j =q; j >=0 ; j--) {
						int result=s[i][j];
						if (result==0) {
							result=1;
						}else{
							result=0;
						}
						arr[i][q-j]=result;
					}
				}
				
				return arr;
			}
		
	}
}
