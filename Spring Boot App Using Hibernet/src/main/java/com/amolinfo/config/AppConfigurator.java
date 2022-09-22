package com.amolinfo.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.amolinfo.dao.CategoryDAO;
import com.amolinfo.dao.CategoryDAOImpl;
import com.amolinfo.dao.UserDAO;
import com.amolinfo.dao.UserDAOImpl;

@EnableWebMvc
@ComponentScan(basePackages={"com.amolinfo.controller"})
public class AppConfigurator {

	@Bean
	public Configuration config()
	{
		Configuration config =new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
		return config;
	}
	
	@Bean
	public SessionFactory hibernateFactory(Configuration config)
	{
		return config.buildSessionFactory();
	}
	
	@Bean
	public UserDAO objUserDAO()
	{
		return new UserDAOImpl();
	}
	
	@Bean
	public CategoryDAO objCategoryDAO()
	{
		return new CategoryDAOImpl();
	}
	
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		
		resolver.setPrefix("/WEB-INF/presentation/");
		
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
}









