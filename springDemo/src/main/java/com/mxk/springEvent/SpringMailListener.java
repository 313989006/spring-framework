package com.mxk.springEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * ApplicationListener Spring 的监听器
 **/
@Component
public class SpringMailListener implements ApplicationListener<SpringMailEvent2> {

	@Override
	public void onApplicationEvent(SpringMailEvent2 event) {
		System.out.println("send mail...................");
	}
}
