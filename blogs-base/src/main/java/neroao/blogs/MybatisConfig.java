package neroao.blogs;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.pool.DruidDataSourceFactory;

@Configuration
@MapperScan(basePackages="neroao.blogs.modle.mapper")
public class MybatisConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource getDataSource() throws Exception{
		Properties prope =new Properties();
		prope.put("driverClassName", env.getProperty("jdbc.driverClass"));
		prope.put("url", env.getProperty("jdbc.url"));
		prope.put("username", env.getProperty("jdbc.username"));
		prope.put("password", "000000");
		return DruidDataSourceFactory.createDataSource(prope);
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource db) throws Exception{
		SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
		fb.setDataSource(db);
		fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));
		fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapperLocations")));
		return fb.getObject();
	}
}
