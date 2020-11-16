package com.mxk.service.impl;

import com.mxk.service.HiService;
import org.springframework.stereotype.Service;

/**
 * @ClassName HiServiceImpl
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/11/16 14:42
 **/
@Service
public class HiServiceImpl implements HiService {
	@Override
	public void sayHi() {
		System.out.println("hi everyone");
	}

	@Override
	public String justWantToSayHi() {
		return "just want to say hi";
	}
}
