package com.mxk.test;

import com.mxk.config.AppConfig;
import com.mxk.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName IocTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/12 9:39
 **/
public class IocTest {

	public static void main(String[] args) {
		// 把 Spring 需要的环境准备好
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		IndexDao indexDao = context.getBean(IndexDao.class);
		indexDao.query();
	}
}
