package leetcode.solution.sql;

public class SecondHighestSalary {

	/**
	 *  Question :176. Second Highest Salary
	 *  Category: 	SQL    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 * */
	
	String sql ="select Max(salary) as SecondHighestSalary  from Employee where"
			+ " salary< (select Max(salary) from Employee)";
}
