package cn.itcast.data;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.entity.User;


//第四种：表达式方式获取表单数据
//注意：既有属性封装又有模型驱动，则属性封装得不到值，而模型驱动的的模型有值
public class DataDemo3Action extends ActionSupport {
	
	//前提要求：表单输入项name属性值和实体类属性名称一样
	private User user;
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String execute() throws Exception {
		//System.out.println(user.getUsername()+user.getPassword()+user.getAddress());
		System.out.println(user);
		return NONE;
	}

	
}
