package com.web.init;

import org.apache.catalina.LifecycleException;

import javax.servlet.ServletException;

/**
 * @ClassName Test
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/1 10:58
 **/
public class MxkTest {
	public static void main(String[] args) {
		try {
			MxkSpringApplication.run();
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}

	}
}
