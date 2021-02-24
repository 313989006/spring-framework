package com.mxk.springEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ClassName MailBean
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/2/24 14:38
 **/
@Component
public class MailBean {

	@Autowired
	ApplicationContext applicationContext;

	public void sendMail(){
		// 触发邮件事件
		applicationContext.publishEvent(new SpringMailEvent2(applicationContext));
	}
}
