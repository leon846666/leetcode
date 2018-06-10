package leetcode.solution.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAllNumbersDisappearedinAnArray {

	public static List<Integer> findAllNumbersDisappearedinAnArray (int[] nums) {
		List<Integer> list=IntStream.of(nums).boxed().collect(Collectors.toList());
		Map<Integer,List<Integer>>map=list.stream().collect(Collectors.groupingBy(u->u.intValue()));
		
        List<Integer> num=new ArrayList<Integer>();
       for(int i=1;i<=nums.length;i++){
           if(map.get(i)==null){
              num.add(i); 
           }
       }
       return num;
		
		
		
	}
	
	public static void main(String[] args) {
		int[] nums={4,3,2,7,8,2,3,1};
		
		List<Integer> list2 = findAllNumbersDisappearedinAnArray(nums);
		for (Integer integer : list2) {
			System.out.println(integer);
		}
	}
}
