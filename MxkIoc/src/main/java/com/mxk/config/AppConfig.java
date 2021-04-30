package com.mxk.config;

import com.mxk.dao.IndexDao;
import com.mxk.dao.OrderDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/12 9:34
 **/
@Configuration
@ComponentScan("com.mxk")
public class AppConfig {

	@Bean
	public static IndexDao indexDao(){
		return new IndexDao();
	}

//	@Bean
//	public IndexDao indexDao(){
//		return new IndexDao();
//	}

	/**
	* 如果 indexDao 是 static 的，那么 IndexDao 会被实例化两次
	 * 如果不是 static 的，那么 IndexDao 只会被实例化一次
	*/
	@Bean
	public OrderDao orderDao(){
		indexDao();
		return new OrderDao();
	}

}
