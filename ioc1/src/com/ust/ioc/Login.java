package com.ust.ioc;

public class Login {
	private String UserName;
	private String password;
	DBConnection db;//dependency
	
	public String validate() {
		//obtain connection and write sql to verify useName and password exist in database
		//DBConnection connection =DBConnection.getConnection();
		 //db=new DBConnection();//object instantiated reference given 
		Connection con=db.getConnection();
				
		return "login validated..";
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public DBConnection getDb() {
		return db;
	}
	public void setDb(DBConnection db) {
		this.db = db;
	}
	

}
