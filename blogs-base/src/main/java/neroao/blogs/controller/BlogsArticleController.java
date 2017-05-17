package neroao.blogs.controller;

import java.util.Date;

import neroao.blogs.modle.BlogsArticle;
import neroao.blogs.service.BlogsArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class BlogsArticleController {
	@Autowired
	private BlogsArticleService service;
	
	@GetMapping("/createArcitle")
	public boolean createBlogsArticle(){
		BlogsArticle article = new BlogsArticle();
		article.setAuther("neroao");
		article.setContent("test");
		article.setTitle("test title");
		article.setCreateTime(new Date());
		article.setLastUpdateTime(new Date());
		return service.createBlogsArticle(article);
	}
}
