package lxh.dao;
import java.util.List;
import lxh.entity.User;
public interface UserDAO {
	 void save(User user);
	 User getUser(String name);
	 void delete(int id);
	 void update(User user);
	 User findById(int id);
	 List<User> findAll();
}