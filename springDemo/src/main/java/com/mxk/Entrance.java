package com.mxk;

import com.mxk.service.WelcomService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @ClassName Entrance
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/30 11:18
 **/
public class Entrance {

	public static void main(String[] args) {
		System.out.println("Hello World");

		String configPath = "G:\\myGitHubProject\\spring-framework\\springDemo\\src\\main\\resources\\spring\\spring-config.xml";

		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(configPath);
		WelcomService welcomService = (WelcomService) context.getBean("welcomService");

		welcomService.sayHello("mxk");

	}
}
