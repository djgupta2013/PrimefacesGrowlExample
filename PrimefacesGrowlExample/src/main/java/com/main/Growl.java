package com.main;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.stereotype.Component;

@SessionScoped

@ManagedBean(name="growl")
@Component(value = "growl")
@ELBeanName(value = "growl")
public class Growl {

	private String username;  

	private String password;  
	public String getUsername() {  
	return username;  
	}  
	public void setUsername(String username) {  
	this.username = username;  
	}  
	public String getPassword() {  
	return password;  
	}  
	public void setPassword(String password) {  
	this.password = password;  
	}  
	public void displayMessage() {  
	FacesContext context = FacesContext.getCurrentInstance(); 
	if(username.equals("dhananjay")&password.equals("12345"))
	context.addMessage(null, new FacesMessage("Login Successfuly", "Welcome: " + username)); 
	else {
		context.addMessage(null, new FacesMessage("Login Failed", "incorrect: " + username));
	}
	System.out.println("Hello");
	
	}  
	}  