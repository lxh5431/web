package controllerTest;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import com.google.gson.Gson;

import base.BaseControllerTest;
import blog.dao.Blog;
import blog.dao.User;

/**
 *
 * @Message:  created by Liujishuai on 2015骞�9鏈�24鏃�
 * 
 * @Description:
 */
public class BlogControllerTest extends BaseControllerTest {
	
  /**
   * 鍐欏崥瀹㈡祴璇�
   */
	@Test
	public void writeBlog() {
		Blog blog =new Blog();
		blog.setTitle("9.24灏忛煩瑕侀椈5");
		blog.setDes("灏忛煩鍏充簬璋冩垙濡瑰瓙鐨勫嚑鐐归棶棰�5");
		blog.setContext("闂1锛氥�傘�傘�傘�傘�傘�傞棶棰�2.銆傘�傘�傘�傘��");
		String objString=new Gson().toJson(blog);
		System.out.println(objString);
		try {
			mockMvc.perform(
					MockMvcRequestBuilders.post("/blog/writeBlog")
					.header("userId", "4")
					.content(objString)
					.accept(MediaType.APPLICATION_JSON)
					.characterEncoding("UTF-8")
					.contentType(MediaType.APPLICATION_JSON))
					.andExpect(status().isOk())
					.andDo(MockMvcResultHandlers.print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 鏀瑰崥瀹㈡祴璇�
	 */
	@Test
	public void updateBlog() {
		Blog blog =new Blog();
		blog.setId(8);
		blog.setTitle("9.24知乎日报");
		blog.setDes("如何看待呢南海问题");
		blog.setContext("问题1：中国为何态度不够坚决，2民主的反应");
		blog.setUserId(4);
		String objString=new Gson().toJson(blog);
		System.out.println(objString);
		try {
			mockMvc.perform(
					MockMvcRequestBuilders.post("/blog/updateBlog")
					.header("userId", "4")
					.content(objString)
					.accept(MediaType.APPLICATION_JSON)
					.characterEncoding("UTF-8")
					.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
					.andDo(MockMvcResultHandlers.print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 */
	@Test
	public void deleteBlog() {
		try {
			mockMvc.perform(
					MockMvcRequestBuilders.post("/blog/deleteBlog")
					.param("blogId","4")
					 .header("userId", "4")
					)
				
					.andExpect(status().isOk())
					.andDo(MockMvcResultHandlers.print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 */
	@Test
	public void getBlogList() {
		try {
			mockMvc.perform(
					MockMvcRequestBuilders.post("/blog/getBlogList")
					//.param("userId","4")
					.header("userId", "4")).andExpect(status().isOk())
					.andDo(MockMvcResultHandlers.print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 */
	@Test
	public void getBlogDetails() {
		try {
			mockMvc.perform(
					MockMvcRequestBuilders.post("/blog/getBlogDetails")
					.param("blogId","5")).andExpect(status().isOk())
					.andDo(MockMvcResultHandlers.print());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

