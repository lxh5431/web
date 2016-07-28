package serviceTest;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import base.BaseControllerTest;
import blog.dao.User;
import blog.service.impl.UserService;

/**
 * 
 * @author lxh
 */
public class UserServerTest extends BaseControllerTest {
	@Autowired
	private UserService userService;

    @Test
    public void testInsertUser(){
    	User user=new User();
    	user.setName("丽娜");
    	user.setPassword("123123");
    	user.setLevel(1);
    	user.setDes("最美的我们在农村第一场丽娜");
    	user.setAddress("江苏苏州");
    	userService.insert(user);
    }
    @Test
    public void testGetUserById(){
    	Integer id=1;
    	User user=userService.selectByPrimaryKey(id);
    	System.out.println(user.getName()+":"+user.getDes());
    }
    @Test
    public void testGetUserList(){
    	String username="sk";
    	
      List<User> pageInfo= userService.getUserList(null, username, new RowBounds(1,2));
      String objString=new Gson().toJson(pageInfo);
      System.out.println(objString);
    }
}
