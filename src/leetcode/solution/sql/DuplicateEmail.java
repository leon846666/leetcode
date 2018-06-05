package leetcode.solution.sql;

public class DuplicateEmail {

		public static void main(String[] args) {
			
			/**
			 *  Question : 182. DuplicateEmail
			 *  Category: 	SQL    
			 * 	Level : 	Easy
			 * 	Result: 	Accepted
			 * 	Author: 	Yang Liu
			 * */
			
			String sql="select Email from Person group by Email having count(Email) >1";
			
	}

}
