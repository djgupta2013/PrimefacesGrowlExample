package com.main;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.sun.faces.config.ConfigureListener;

@SpringBootApplication

public class PrimefacesGrowlExampleApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PrimefacesGrowlExampleApplication.class, args);
	}
	 @Bean
	    public FacesServlet facesServlet() {
	        return new FacesServlet();
	    }

	    @Bean
	    public ServletRegistrationBean<FacesServlet> facesServletRegistration() {
	        ServletRegistrationBean<FacesServlet> registration = new ServletRegistrationBean<FacesServlet>(facesServlet(), "*.xhtml");
	        registration.setName(".jsf");
	        return registration;
	    }

	    @Bean
	      public ServletListenerRegistrationBean<ConfigureListener> jsfConfigureListener()         {
	          return new ServletListenerRegistrationBean<ConfigureListener>(new ConfigureListener());
	      }
	
	
}
