package com.mxk;

import org.springframework.context.annotation.*;

/**
 * @ClassName CircleDependencyTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/30 15:33
 **/
@Configuration
@ComponentScan("com.mxk")
public class CircleDependencyTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(CircleDependencyTest.class);


	}
}
