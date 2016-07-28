package blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import blog.dao.User;
import blog.dto.output.UserDetails;
import core.mapper.IBaseMapper;

public interface UserMapper extends IBaseMapper<User> {
public UserDetails getUserDetailsById(Integer id);
public List<User> getUserListByLevel(@Param("level")Integer level,@Param("username")String username);
public void deleteByIdList(@Param("idList")List<Integer>idList);
public Integer getUserNameCount(String username);
public User getByUserName(String username);
}
