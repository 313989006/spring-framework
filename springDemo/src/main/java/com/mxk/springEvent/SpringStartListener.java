package com.mxk.springEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * 监听 ContextStartedEvent 事件
 **/
@Component
public class SpringStartListener implements ApplicationListener<ContextStartedEvent> {


	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("spring applicaiton started===============================");
	}
}
