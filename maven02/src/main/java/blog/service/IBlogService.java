package blog.service;

import java.util.List;

import blog.dao.Blog;
import blog.dto.output.BlogDetails;
import core.service.IBaseService;

public interface IBlogService extends IBaseService<Blog> {
	public void createBlog(Blog blog,Integer userId);
	public void updateBlog(Blog blog,Integer userId);
	public void deleteBlog(Integer blogId,Integer userId);
	public List<BlogDetails> getUserBlogList(Integer userId);

}
