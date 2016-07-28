package blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import blog.dao.UserRole;
import core.mapper.IBaseMapper;

public interface UserRoleMapper extends IBaseMapper<UserRole> {
	List<Integer>getRoleIdListByUserId(Integer userId);
	public void addUserRoleList(@Param("userId") Integer userId, @Param("roleIdList") List<Integer> roleIdList);

	public void deleteUserRoleList(@Param("userId") Integer userId, @Param("roleIdList") List<Integer> roleIdList);

	public void deleteByUserIdList(@Param("UserIdList") List<Integer> UserIdList);
}
