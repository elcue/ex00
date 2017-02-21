package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {
	
	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL ="jdbc:mysql://localhost/springbook";
	private static final String USER="springbook";
	private static final String PW ="elcue";
	
	@Test
	public void testConnection() throws Exception{
		
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}