package sis.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DBUtils {
	
	
	private static Connection conn;
	private static Statement st;
	private static ResultSet rs;
	
	public static void getConnection() {
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		
		try {
			
			String dbUrl= ConfigsReader.getProperty("dbUrl");
		
		
			conn = DriverManager.getConnection(dbUrl);
			
		} catch (SQLException e) {
			
			System.out.println("Can not connect to the DB");
		}
	}
	
	public static List<Map<String,String>> storeDataFromDB(String sqlQuery){
		
		 List<Map<String,String>> listOfMaps = new ArrayList<>();
		 
		 Map<String,String> map;
		 
		 try {
			st= conn.createStatement();
			rs =st.executeQuery(sqlQuery);
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int columnCount = rsmd.getColumnCount();
			
			while(rs.next()) {
				
				map= new LinkedHashMap<>();
				for(int i=1;i<=columnCount;i++) {
					
					map.put(rsmd.getColumnName(i), rs.getString(i));
					listOfMaps.add(map);
					
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		
		return listOfMaps;
		
		
	}
	
	public static void  closeConnection() {
		
		try {
		if(rs !=null) {rs.close();}
		if(st!=null) {st.close();}
		if(conn!=null) {conn.close();}

		}
		catch (SQLException e) {
			System.out.println("Not able to close!");
		}
		
	
	}
	
		
		
}
	
	
	
	


