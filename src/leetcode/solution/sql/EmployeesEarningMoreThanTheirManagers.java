package leetcode.solution.sql;

public class EmployeesEarningMoreThanTheirManagers {

		public static void main(String[] args) {
			
			/**
			 *  Question : 181. Employees Earning More Than Their Managers
			 *  Category: 	SQL    
			 * 	Level : 	Easy
			 * 	Result: 	Accepted
			 * 	Author: 	Yang Liu
			 * */
			 
			String sql="Select a.Name as Employee from Employee a ,Employee b where a.ManagerId = b.Id and a.Salary>b.Salary";
			
	}

}
