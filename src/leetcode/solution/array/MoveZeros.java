package leetcode.solution.array;

public class MoveZeros {
	
	public static void  moveZeros(int []nums) {
		int index =-1;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0){
				index++;
				nums[index]=nums[i];
				 
			}
    }
        for(int i =index+1;i<nums.length;i++){
            nums[i]=0;
        }
		
        
		
	}
	public static void main(String[] args) {
		int []nums={0,1,0,3,12};
		moveZeros(nums);
		
	}
}
