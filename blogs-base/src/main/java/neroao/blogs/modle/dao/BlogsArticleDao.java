package neroao.blogs.modle.dao;

import neroao.blogs.modle.BlogsArticle;
import neroao.blogs.modle.mapper.BlogsArticleMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BlogsArticleDao {
	@Autowired
	private BlogsArticleMapper blogsArticleMapper;
	
	public int insertBlogsArticle(BlogsArticle article){
		return blogsArticleMapper.insertBlogsArticle(article.getTitle(),
				article.getAuther(), article.getContent(), article.getCreateTime(), article.getLastUpdateTime());
	}
}
