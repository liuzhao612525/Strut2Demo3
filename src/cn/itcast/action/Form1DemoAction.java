package cn.itcast.action;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.dispatcher.Parameter;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Form1DemoAction extends ActionSupport {
	public String execute() throws Exception {
		
		ActionContext context = ActionContext.getContext();
		//key:表单输入项name属性值，value是输入的值
		Map<String ,Parameter> map = context.getParameters();
		
		Set<String> keys = map.keySet();
		for (String string : keys) {
			Parameter obj = (Parameter)map.get(string);
			System.out.println(obj);
		}
		
		return NONE;
	}
}
