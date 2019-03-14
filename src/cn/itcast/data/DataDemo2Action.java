package cn.itcast.data;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.entity.User;


//第三种：模型驱动的方式获取表单数据
//注意：既有属性封装又有模型驱动，则属性封装得不到值，而模型驱动的的模型有值
public class DataDemo2Action extends ActionSupport implements ModelDriven<User> {
	
	//前提要求：表单输入项name属性值和实体类属性名称一样
	private User user = new User();
	
	public User getModel() {
		
		return user;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(user.getUsername()+user.getPassword()+user.getAddress());
		return NONE;
	}

	
}
