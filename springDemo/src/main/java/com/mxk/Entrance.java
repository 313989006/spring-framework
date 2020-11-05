package com.mxk;

import com.mxk.controller.WelcomeController;
import com.mxk.service.WelcomService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @ClassName Entrance
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/30 11:18
 **/
@Configuration
@ComponentScan("com.mxk")
public class Entrance {

	public static void main1(String[] args) {
		System.out.println("Hello World");

		String configPath = "G:\\myGitHubProject\\spring-framework\\springDemo\\src\\main\\resources\\spring\\spring-config.xml";

		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(configPath);
		WelcomService welcomService = (WelcomService) context.getBean("welcomService");

		welcomService.sayHello("mxk");

	}

	public static void main(String[] args) {
		// 容器实例
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames){
			System.out.println(beanDefinitionName);
		}

		WelcomService welcomService = (WelcomService)applicationContext.getBean("welcomServiceImpl");
		welcomService.sayHello("强大的Spring");

		WelcomeController welcomeController = (WelcomeController)applicationContext.getBean("welcomeController");
		welcomeController.sayHello();
	}
}
