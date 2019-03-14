package cn.itcast.data;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itcast.entity.User;




/**
 * @author liuzhao
 *分装数据到map集合
 */
public class MapAction extends ActionSupport {
	
	
	private Map<String, User> map;
	
	public Map<String, User> getMap() {
		return map;
	}
	public void setMap(Map<String, User> map) {
		this.map = map;
	}
	@Override
	public String execute() throws Exception {
		//System.out.println(user.getUsername()+user.getPassword()+user.getAddress());
		System.out.println(map);
		return NONE;
	}

	
}
