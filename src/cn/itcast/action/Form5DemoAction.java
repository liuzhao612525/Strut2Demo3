package cn.itcast.action;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.Parameter;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.entity.User;

public class Form5DemoAction extends ActionSupport {
	public String execute() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		System.out.println(username + password + address);
		
		//第一种
		User user = new User();
		user.setUsername(username);
		user.setAddress(address);
		user.setPassword(password);
		
		
		
		return NONE;
	}
}
