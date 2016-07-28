package blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import blog.dao.Blog;
import blog.dto.output.BlogDetails;
import core.mapper.IBaseMapper;

public interface BlogMapper extends IBaseMapper<Blog> {
public void deleteByIdAndUserId(@Param("userid")Integer userid,@Param("id")Integer id);
public List<BlogDetails>getUserBlogDetails(Integer userId);
}
