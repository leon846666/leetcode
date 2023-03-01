package leetcode.solution.sql;

public class DeleteDuplicateEmails {

	/**
	 *  Question :196. Delete Duplicate Emails
	 *  Category: 	SQL    
	 * 	Level : 	Easy
	 * 	Result: 	Accepted
	 * 	Author: 	Yang Liu
	 *
	 * */
	
	String sql = "delete p from Person p ,Person p2 where p.Email=p2.Email and p2.Id <p.Id";
}
