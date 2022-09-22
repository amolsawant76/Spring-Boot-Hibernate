package com.amolinfo.dao;

public interface UserDAO {

	public void addUser(String userName,String password,String name,String email,String mobile);
	public boolean validateUser(String userName,String password);
}
