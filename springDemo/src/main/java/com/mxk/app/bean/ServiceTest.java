package com.mxk.app.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @Description 验证 @Autowired 注入是先 byType 还是先 byName
 * @Autowired 注入模型：0：autowired_no   1：autowired_byType   2:autowired_byName   3:autowired_construct
 * 装配技术只有 ： autowired_byType、autowired_byName
 **/
@Service
public class ServiceTest {

	@Autowired
	MxkService mxkService1;

	// @PostConstruct:意思是初始化类的时候就加载这个方法
	@PostConstruct
	public void init(){
		System.out.println("===========================" + mxkService1.getClass().getName() + "===========================");
//		System.out.println(mxkService1.test());
	}
}
