package leetcode.solution.sql;

public class RisingTemperature {

		public static void main(String[] args) {
			
			/**
			 *  Question : 197.Rising Temperature
			 *  Category: 	SQL    
			 * 	Level : 	Easy
			 * 	Result: 	Accepted
			 * 	Author: 	Yang Liu
			 * */
		
			String sql="select Weather.id from Weather"
					+ " join Weather w "
					+ " on datediff( Weather.RecordDate,w.RecordDate)=1 "
					+ " and Weather.Temperature > w.Temperature;";
			
	}

}
