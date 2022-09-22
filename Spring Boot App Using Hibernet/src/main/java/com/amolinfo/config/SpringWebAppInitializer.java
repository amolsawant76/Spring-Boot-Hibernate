package com.amolinfo.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebAppInitializer implements WebApplicationInitializer {

	@Override
public void onStartup(ServletContext servletContext) throws ServletException {
		
		
		System.out.println("onstartup of the SpringWebAPpInitializer Fired");
		
		AnnotationConfigWebApplicationContext context= new AnnotationConfigWebApplicationContext();
		
		context.register(AppConfigurator.class);
		
		context.setServletContext(servletContext);
		
		ServletRegistration.Dynamic servlet=servletContext.addServlet("dispatcher",new DispatcherServlet(context));

		servlet.addMapping("/spring/*");
		
		servlet.setLoadOnStartup(10);
	}

}
