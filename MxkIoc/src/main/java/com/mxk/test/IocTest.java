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
		// 准备工厂 == DefaultListableBeanFactory
		// 实例化一个 bdReader 和 一个scanner
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// 把 一个 class 转换成 BeanDefinition，最后 put 到 beanDefinitionMap
		// beanDefinitionMap 位置 DefaultListableBeanFactory 的 beanDefinitionMap
		context.register(AppConfig.class);

		// 初始化 Spring 的环境
		context.refresh();

		IndexDao indexDao = context.getBean(IndexDao.class);
		indexDao.query();
	}
}
