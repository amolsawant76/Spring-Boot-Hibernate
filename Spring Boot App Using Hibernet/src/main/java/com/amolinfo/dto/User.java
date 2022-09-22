package com.amolinfo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="users")
@NamedQueries({
			@NamedQuery(name="authenticateUser",
					query="select OBJECT(objUser) from User objUser where objUser.userName=:uName and objUser.password=:pwd")
})
public class User {
	
	@Id
	@Column(name="userName")
	String userName;
	@Column(name="password")
	String password;
	@Column(name="name")
	String name;
	@Column(name="email")
	String email;
	@Column(name="mobile")
	String mobile;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	

}
