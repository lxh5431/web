package lxh.service;
import java.util.List;

import lxh.entity.User;

public interface UserService {
	void saveUser(User user);
	User getUser(String name);
	void deleteUser(int id);
	void updateUser(User user);
	User findUserById(int id);
	List<User> findAll();
}
