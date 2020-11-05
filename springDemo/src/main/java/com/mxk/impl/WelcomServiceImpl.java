package com.mxk.impl;

import com.mxk.service.WelcomService;

/**
 * @ClassName WelcomServiceImpl
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/30 11:28
 **/
public class WelcomServiceImpl implements WelcomService {

	@Override
	public String sayHello(String name) {
		System.out.println("Hello : " + name);
		return "success";
	}
}
