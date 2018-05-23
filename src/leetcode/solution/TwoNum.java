package leetcode.solution;

public class TwoNum {

	static class  Solutoin{
		
		public static int [] twoNum(int arr[],int target) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i]+arr[j]==target){
						int [] arr2 = {i,j};
						return  arr2;
					}
					
				}
			}
			
			
		return null;
		}
		
	}
	public static void main(String[] args) {
		int arr[]={4,6,2,7};
		arr=TwoNum.Solutoin.twoNum(arr, 9);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(Math.max(2, 3));
		
	}
}
