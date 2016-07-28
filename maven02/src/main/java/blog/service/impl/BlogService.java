package blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blog.dao.Blog;
import blog.dto.output.BlogDetails;
import blog.mapper.BlogMapper;
import blog.mapper.UserRoleMapper;
import blog.service.IBlogService;
import core.exception.MyException;
import core.mapper.IBaseMapper;
import core.service.BaseService;
@Service
public class BlogService extends BaseService<Blog> implements IBlogService {
@Autowired
	private BlogMapper blogMapper;
@Autowired
private UserRoleMapper userRoleMspper;
@Override
public  IBaseMapper<Blog> getBaseMapper(){
	return blogMapper;
}

	public void createBlog(Blog blog, Integer userId) {
		// TODO Auto-generated method stub
		blog.setId(null);
		blog.setUserId(userId);
		blogMapper.insertSelective(blog);
	}
	public void updateBlog(Blog blog, Integer userId) {
		// TODO Auto-generated method stub
		if(userId.equals(blog.getUserId())){
			blogMapper.updateByPrimary(blog);
		}else{
			throw new MyException("只能够修改自己的博客");
		}
	}
	public void deleteBlog(Integer blogId, Integer userId) {
		// TODO Auto-generated method stub
		List<Integer>roleIdList=userRoleMspper.getRoleIdListByUserId(userId);
	if(roleIdList.contains(1)){
		blogMapper.deletePrimaryKey(blogId);
	}else{
		blogMapper.deleteByIdAndUserId(userId, blogId);
	}
	}
	public List<BlogDetails> getUserBlogList(Integer userId) {
		// TODO Auto-generated method stub
		return blogMapper.getUserBlogDetails(userId);
	}


}
