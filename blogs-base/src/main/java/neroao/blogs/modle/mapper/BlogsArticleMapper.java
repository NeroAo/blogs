package neroao.blogs.modle.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface BlogsArticleMapper {
	@Insert("INSERT INTO blogs_article(title,auther,content,createTime,lastUpdateTime) VALUES (#{title},#{auther},#{content},#{createTime},#{lastUpdateTime})")
	public int insertBlogsArticle(@Param("title")String title,@Param("auther")String auther,@Param("content")String content,
			@Param("createTime")Date createTime,@Param("lastUpdateTime")Date lastUpdateTime);

}
