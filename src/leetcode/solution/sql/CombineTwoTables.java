package leetcode.solution.sql;

public class CombineTwoTables {

		public static void main(String[] args) {
			
			/**
			 *  Question : 175. Combine Two Tables
			 *  Category: 	SQL    
			 * 	Level : 	Easy
			 * 	Result: 	Accepted
			 * 	Author: 	Yang Liu
			 * */
			
			String sql="select FirstName,LastName,City,State from Person left join Address on Person.PersonId = Address.PersonId;";
			
	}

}
