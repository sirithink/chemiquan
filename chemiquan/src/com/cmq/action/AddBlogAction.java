package com.cmq.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.cmq.bean.Blog;
import com.cmq.service.BlogService;
import com.cmq.util.image.GetImage;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author Andrew
 *         <p>
 *         写blog的action，其中会将日志中的图片替换成服务器地址后保存到数据库中，图片存在服务器文件夹中
 *         </p>
 * 
 */
public class AddBlogAction extends ActionSupport{
	private HttpServletRequest request =ServletActionContext.getRequest();
	/** 依赖于spring 的注入 */
	private BlogService blogService;

	/** 从浏览器传入的数据 */
	private long user_id;
	private long belong_id;
	private long category_id;
	private String title;
	private String content_temp;
	private boolean synchro;

	
	public String addBlog(){
		Blog blog=new Blog();
		GetImage getImage=new GetImage();
		//设置blog表中的各种参数
		blog.setBelong_id(belong_id);
		blog.setCategory_id(category_id);
		//刚刚添加的日志评论为0
		blog.setComment_count(0);
		//使用GetImage将图片存储并分离日志
		blog.setContent(getImage.getImageAddSaveIt(content_temp,request.getRealPath("/uploadimg"), request.getRemoteAddr()));
		blog.setPublish_time(new Date());
		blog.setSynchro(synchro);
		blog.setTitle(title);
		blog.setUser_id(user_id);
		//刚添加时访问人数为0
		blog.setVisitor_count(0);
		
		blogService.add(blog);
		return SUCCESS;
	}
	
	
	public BlogService getBlogService() {
		return blogService;
	}

	public void setBlogService(BlogService blogService) {
		this.blogService = blogService;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public long getBelong_id() {
		return belong_id;
	}

	public void setBelong_id(long belong_id) {
		this.belong_id = belong_id;
	}

	public long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent_temp() {
		return content_temp;
	}

	public void setContent_temp(String content_temp) {
		this.content_temp = content_temp;
	}

	public boolean isSynchro() {
		return synchro;
	}

	public void setSynchro(boolean synchro) {
		this.synchro = synchro;
	}

}
