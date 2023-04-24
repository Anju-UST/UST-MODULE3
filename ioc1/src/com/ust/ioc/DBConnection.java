package com.ust.ioc;

import java.sql.DriverManager;
import java.sql.SQLException;

//public class DBConnection {
//	public static DBConnection getConnection() {
//		System.out.println("get connection called");
//		return new DBConnection();
//	}

public class DBConnection implements Connection{
	//JDBC
	
	private String url;
	private String dbUserName;
	private String dbPassword;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDbUserName() {
		return dbUserName;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public Connection getConnection() {
		try {
			java.sql.Connection con = DriverManager.getConnection(url,dbUserName,dbPassword);
			System.out.println("connection to mysql");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("get connection called..");
		return new DBConnection(); 
		//to connect to sql jar file mysql connector jar
	
	}
}
