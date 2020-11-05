package com.mxk.controller;

import com.mxk.service.WelcomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName WelcomeController
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/11/5 16:18
 **/
@Controller
public class WelcomeController {

	@Autowired
	private WelcomService welcomService;

	public void sayHello(){
		System.out.println("来自强大的Spring的问候！");
	}
}
