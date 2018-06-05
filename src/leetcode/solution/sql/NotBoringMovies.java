package leetcode.solution.sql;

public class NotBoringMovies {

	public static void main(String[] args) {
		
		/**
		 *  Question : 620. Not Boring Movies
		 *  Category: 	SQL    
		 * 	Level : 	Easy
		 * 	Result: 	Accepted
		 * 	Author: 	Yang Liu
		 * */
		
		String sql="select * from cinema where id%2!=0 and description !='boring' order by rating desc;";
		
	}
}
