package com.mxk.app.test;

import com.mxk.app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/2/23 14:58
 **/
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext
				= new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
