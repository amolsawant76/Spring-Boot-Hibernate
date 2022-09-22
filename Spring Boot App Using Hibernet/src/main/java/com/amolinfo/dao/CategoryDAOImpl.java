package com.amolinfo.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.amolinfo.dto.Category;

public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory hibernateFactory;
	
	@Override
	public List<Category> getAllCategories() {
		
		try(Session hibernateSession=hibernateFactory.openSession())
		{
			Query<Category> query=hibernateSession.createQuery("from category");
			return query.getResultList();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}		
}

