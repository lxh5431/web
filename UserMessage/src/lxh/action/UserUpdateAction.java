package lxh.action;

import com.opensymphony.xwork2.ActionSupport;

import lxh.entity.User;
import lxh.service.UserService;
@SuppressWarnings("serial")
public class UserUpdateAction extends ActionSupport {
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String execute(){
		if(userService.findUserById(user.getId())!=null)
		{	
			setUser(user);
			userService.updateUser(user);
			return SUCCESS;
		}
		addActionMessage(getText("error.message.not.exist"));
		return INPUT;
	}
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
