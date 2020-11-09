package com.mxk;

import com.mxk.entity.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @ClassName AliasTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/11/6 11:33
 **/
public class AliasTest {

	public static void main(String[] args) {
		User user = new User();
		String configPath = "G:\\myGitHubProject\\spring-framework\\springDemo\\src\\main\\resources\\spring\\spring-config.xml";

		ApplicationContext context = new FileSystemXmlApplicationContext(configPath);

		String[] aliaes = context.getAliases("user");
		for (String str : aliaes) {
			System.out.println(str);
		}

	}
}
