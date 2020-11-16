package com.mxk.service.impl;

import com.mxk.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @ClassName HeeloServiceImpl
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/11/16 14:40
 **/
@Service
public class HelloServiceImpl implements HelloService {
	@Override
	public void sayHello() {
		System.out.println("hello everyBody");
	}

	@Override
	public void justWantToThrowException() {
		throw new RuntimeException("hello exception");
	}
}
