package com.mxk.impl;

import com.mxk.service.WelcomService;
import org.springframework.stereotype.Service;

/**
 * @ClassName WelcomServiceImpl
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/30 11:28
 **/
@Service
public class WelcomServiceImpl implements WelcomService {

	@Override
	public String sayHello(String name) {
		System.out.println("Hello : " + name);
		return "success";
	}
}
