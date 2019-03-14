package cn.itcast.data;

import com.opensymphony.xwork2.ActionSupport;

public class DataDemo1Action extends ActionSupport {
	
	
	//第二种：属性封装
	
	private String username;
	private String password;
	private String address;
	
	
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String execute() throws Exception {
		System.out.println(username+password+address);
		return NONE;
	}
}
