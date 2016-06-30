package lxh.action;
import com.opensymphony.xwork2.ActionSupport;

import lxh.entity.User;
import lxh.service.UserService;
@SuppressWarnings("serial")
public class UserAction extends ActionSupport {
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	private User user;
	public String execute(){
		User u=new User();
		u.setName(user.getName());
		u.setPassword(user.getPassword());
		u.setType(user.getType());
		userService.saveUser(u);
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
