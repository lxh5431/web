package lxh.service;

import java.util.List;

import lxh.dao.UserDAO;
import lxh.entity.User;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO){
		this.userDAO=userDAO;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		if(userDAO.findById(user.getId())==null)
			userDAO.save(user);
		
	}

	@Override
	public User getUser(String name) {
		// TODO Auto-generated method stub
		
		return userDAO.getUser(name);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		if(userDAO.findById(id)!=null)
			userDAO.delete(id);
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		if(userDAO.findById(user.getId())!=null)
			userDAO.update(user);
			
		
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return userDAO.findById(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}

	
	

}
