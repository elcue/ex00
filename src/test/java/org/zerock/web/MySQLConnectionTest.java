package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

/**
 * SpringBoard 
 * 클래스명 : MySQLConnectionTest.java
 * 작성자 : elcue
 * 작성일 : 2017. 2. 21.
 * 클래스 소개 : MySQL 연결 테스트
 */
public class MySQLConnectionTest {
	
	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL ="jdbc:mysql://127.0.0.1:3306/springbook";
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
