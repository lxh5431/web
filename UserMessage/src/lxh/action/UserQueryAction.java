package lxh.action;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import lxh.entity.User;
import lxh.service.UserService;
@SuppressWarnings("serial")
public class UserQueryAction extends ActionSupport {
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String execute(){	
			List<User> userlist=userService.findAll();
			ServletActionContext.getRequest().setAttribute("userlist", userlist);
			return SUCCESS;
	}
}
