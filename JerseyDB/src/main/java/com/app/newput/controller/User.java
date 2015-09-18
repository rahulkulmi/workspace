package com.app.newput.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.app.newput.bean.UserBean;
import com.app.newput.service.UserService;

@Path("user")
public class User {
	
	UserService service = new UserService();

	@POST
	@Path("/register_1")
	@Produces(MediaType.APPLICATION_XML)
	public UserBean addUser_1(@FormParam("userName") String userName, @FormParam("address") String address, 
			@FormParam("mobileNo") int mobile){
		UserBean bean = new UserBean();
		bean.setName(userName);
		bean.setAddress(address);
		bean.setMobile(mobile);
		bean = service.registerUser_1(bean);
		return bean;		
	}
	
	@POST
	@Path("/register_2")
	@Produces(MediaType.APPLICATION_XML)
	public UserBean addUser_2(@FormParam("userName") String userName, @FormParam("address") String address, 
			@FormParam("mobileNo") int mobile){
		UserBean bean = new UserBean();
		bean.setName(userName);
		bean.setAddress(address);
		bean.setMobile(mobile);
		bean = service.registerUser_2(bean);
		return bean;		
	}
}
