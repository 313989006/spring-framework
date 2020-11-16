package com.mxk;

import com.mxk.entity.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

public class AliasTestDemo {

	public static void main(String[] args) {
		User user = new User();
		String configPath = "G:\\myGitHubProject\\spring-framework\\springDemo\\src\\main\\resources\\spring\\spring-config.xml";

		ApplicationContext context = new FileSystemXmlApplicationContext(configPath);

		String[] aliaes = context.getAliases("user");
		if (aliaes.length > 0){
			for (String str : aliaes) {
				System.out.println(str);
			}
		}


	}
}
