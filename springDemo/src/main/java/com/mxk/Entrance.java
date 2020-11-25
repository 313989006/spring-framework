package com.mxk;

import com.mxk.aspect.OutSide;
import com.mxk.controller.HelloController;
import com.mxk.controller.HiController;
import com.mxk.controller.WelcomeController;
import com.mxk.entity.User;
import com.mxk.introduction.LittleUniverse;
import com.mxk.service.WelcomService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@Configuration
@ComponentScan("com.mxk")
@Import(OutSide.class)
@EnableAspectJAutoProxy
public class Entrance {

	public static void main1(String[] args) {
		System.out.println("Hello World");

		String configPath = "G:\\myGitHubProject\\spring-framework\\springDemo\\src\\main\\resources\\spring\\spring-config.xml";

		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(configPath);
		WelcomService welcomService = (WelcomService) context.getBean("welcomService");

		welcomService.sayHello("mxk");

	}

	public static void main2(String[] args) {
		// 容器实例，两种方式：1、注解的方式，2：配置文件的方式
		// 注解的方式
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);

		// 配置文件的方式
//		String path = "G:\\myGitHubProject\\spring-framework\\springDemo\\src\\main\\resources\\spring\\spring-config.xml";
//		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(path);
//				String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//		for (String beanDefinitionName : beanDefinitionNames){
//			System.out.println(beanDefinitionName);
//		}

		WelcomService welcomService = (WelcomService)applicationContext.getBean("welcomServiceImpl");
		welcomService.sayHello("强大的Spring");

		WelcomeController welcomeController = (WelcomeController)applicationContext.getBean("welcomeController");
		welcomeController.sayHello();

		// 结合 CustomizedBeanDefinitionRegistryPostProcessor ， 验证 user5 是否通过 CustomizedBeanDefinitionRegistryPostProcessor 被注册到容器里
		User user5 = (User) applicationContext.getBean("user5");
		System.out.println("CustomizedBeanDefinitionRegistryPostProcessor 创建的对象： " + user5);
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
//		Company company = (Company) applicationContext.getBean("company");
		// AOP 实现
//		HelloController helloController = (HelloController) applicationContext.getBean("helloController");
//		HiController hiController = (HiController) applicationContext.getBean("hiController");
//
//		helloController.handleRequest();
//		hiController.handleRequest();

		// 测试 introduction--引入型 Advice
		HiController hiController = (HiController) applicationContext.getBean("hiController");
		((LittleUniverse)hiController).burningUp();

		OutSide outSide = (OutSide)applicationContext.getBean("com.mxk.aspect.OutSide");
		outSide.say();
	}
}
