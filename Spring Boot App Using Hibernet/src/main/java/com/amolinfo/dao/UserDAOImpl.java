package com.amolinfo.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.amolinfo.dto.User;

public class UserDAOImpl implements UserDAO {

	
	@Autowired
	SessionFactory hibernateFactory;
	@Override
	public void addUser(String userName, String password, String name, String email, String mobile) {
		
		try(Session hibernateSession=hibernateFactory.openSession())
		{
			hibernateSession.beginTransaction();
			User objUser=new User();
			objUser.setUserName(userName);
			objUser.setPassword(password);
			objUser.setName(name);
			objUser.setEmail(email);
			objUser.setMobile(mobile);
			
			hibernateSession.save(objUser);
			hibernateSession.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public boolean validateUser(String userName, String password) {
		
		try(Session hibernateSession=hibernateFactory.openSession())
		{
			Query query=hibernateSession.getNamedQuery("authenticateUser");
			query.setParameter("uName", userName);
			query.setParameter("pwd", password);
			query.getSingleResult();
			return true;
		}
		catch(Exception he)
		{
			he.printStackTrace();
			return false;
		}
		
	}
	
}
