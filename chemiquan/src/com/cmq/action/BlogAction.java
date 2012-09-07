package com.cmq.action;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.cmq.bean.Blog;
import com.cmq.service.BlogService;
import com.cmq.util.image.GetImage;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author Andrew
 *         <p>
 *         写blog的action，其中会将日志中的图片替换成服务器地址后保存到数据库中，图片存在服务器文件夹中
 *         </p>
 * 
 */
public class BlogAction extends ActionSupport {
	private HttpServletRequest request = ServletActionContext.getRequest();
	/** 依赖于spring 的注入 */
	private BlogService blogService;

	/** 根据页面得到blog ，需要设置page */
	private int page;
	private int pageSize;

	/** 从浏览器传入的数据 */
	private long user_id;
	private long belong_id;
	private long category_id;
	private String title;
	private String content_temp;
	private boolean synchro;

	/**
	 * 添加blog
	 * 
	 * @return String
	 */
	public String addBlog() {
		Blog blog = new Blog();
		GetImage getImage = new GetImage();
		// 设置blog表中的各种参数
		blog.setBelong_id(belong_id);
		blog.setCategory_id(category_id);
		// 刚刚添加的日志评论为0
		blog.setComment_count(0);
		// 使用GetImage将图片存储并分离日志
		blog.setContent(getImage.getImageAddSaveIt(content_temp,
				request.getRealPath("/uploadimg"), request.getRemoteAddr()));
		blog.setPublish_time(new Date());
		blog.setSynchro(synchro);
		blog.setTitle(title);
		blog.setUser_id(user_id);
		// 刚添加时访问人数为0
		blog.setVisitor_count(0);

		blogService.add(blog);
		return SUCCESS;
	}

	/**
	 * 修改文章 只能对文章的内容和标题进行修改
	 * 
	 * @return String
	 */
	public String updateBlog() {
		return SUCCESS;
	}

	/**
	 * 移动blog 将文章移动到不同的分类之中
	 * 
	 * @return
	 */
	public String moveBlog() {
		return SUCCESS;
	}

	/**
	 * 删除blog 见文章删除，还要删除对文章的评论，和访问记录
	 * 
	 * @return
	 */
	public String deleteBlog() {
		return SUCCESS;
	}

	/**
	 * 得到blog列表 如果文章数量少于十篇，就显示所有的，如果文章大于十篇就显示前十篇然后得到所有该类文章的数目，做分页
	 * 
	 * @return
	 */
	public String getBlogList() {
		return SUCCESS;
	}

	/**
	 * 根据页码来得到blog列表
	 * 
	 * @param String
	 */
	public String getBlogListByPage() {
		if (page < 1 || pageSize < 1) {
			return "PageSizeError";
		} else {
			ArrayList<Blog> blogs = this.blogService.getBlogListByPage(page,
					pageSize);
			return SUCCESS;
		}
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

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
