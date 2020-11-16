//package com.mxk.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Repository;
//
///**
// * @ClassName Company
// * @Description 验证 Spring 只支持 Setter 注入的单例循环依赖
// * @Author ma.kangkang
// * @Date 2020/11/15 16:24
// **/
//@Repository
////@Scope(value = "prototype")
//public class Company {
//
//	@Autowired
//	private Staff staff;
//
//	private Company(Staff staff){
//		this.staff = staff;
//	}
//
//}
