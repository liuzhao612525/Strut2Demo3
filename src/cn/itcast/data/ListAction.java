package cn.itcast.data;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.entity.User;




/**
 * @author liuzhao
 *分装数据到list集合
 */
public class ListAction extends ActionSupport {
	
	
	private List<User> list;
	
	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	@Override
	public String execute() throws Exception {
		//System.out.println(user.getUsername()+user.getPassword()+user.getAddress());
		System.out.println(list);
		return NONE;
	}

	
}
