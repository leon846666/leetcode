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
			/**
			 * SELECT
				    weather.id AS 'Id'
				FROM
				    weather
				        JOIN
				    weather w ON DATEDIFF(weather.date, w.date) = 1
				        AND weather.Temperature > w.Temperature
				;
			 * 
			 * 
			 * */
			String sql="select Weather.id from Weather"
					+ " join Weather w "
					+ " on datediff( Weather.RecordDate,w.RecordDate)=1 "
					+ " and Weather.Temperature > w.Temperature;";
			
	}

}
