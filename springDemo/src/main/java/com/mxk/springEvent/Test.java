package com.mxk.springEvent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试 Spring 的 Event 事件监听机制（关联 JDK 的观察者模式--observer包）
 **/
public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		context.getBean(MailBean.class).sendMail();
		context.start();
	}
}
