package com.mxk.controller;

import com.mxk.service.WelcomService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController  implements ApplicationContextAware, BeanNameAware {

	// 类名
	private String myName;

	// 容器
	private ApplicationContext myContainer;

	@Autowired
	private WelcomService welcomService;

	public void sayHello(){
		System.out.println("来自强大的Spring的问候！");

		System.out.println("我的名字：" + myName);
		// 获取 BeanDefinition 容器里所有 Bean 的名字
		String[] beanDefinitionNames = myContainer.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames){
			System.out.println("各个容器的名称： " + beanDefinitionName);
		}

	}

	@Override
	public void setBeanName(String name) {
		this.myName = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.myContainer = applicationContext;
	}
}
