package neroao.blogs.service;

import neroao.blogs.modle.BlogsArticle;
import neroao.blogs.modle.dao.BlogsArticleDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogsArticleService {
	
	@Autowired
	private BlogsArticleDao blogsArticleDao;
	
	public boolean createBlogsArticle(BlogsArticle article){
		return blogsArticleDao.insertBlogsArticle(article)==1?true:false;
	}

}
