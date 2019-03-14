package cn.itcast.action;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.Parameter;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

//使用接口的形式实现（不常用）
public class Form4DemoAction extends ActionSupport {

	public String execute() throws Exception {


		// 操作三个域对象

		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("req", "reqValue");

		HttpSession session = request.getSession();
		session.setAttribute("sess", "sessValue");

		ServletContext context = ServletActionContext.getServletContext();
		context.setAttribute("contextName", "contextValue");
		return NONE;
	}
}
