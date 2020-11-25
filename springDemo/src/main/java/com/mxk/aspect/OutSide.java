package com.mxk.aspect;

/**
 * @ClassName OutSide
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/11/23 10:08
 **/
public class OutSide {

	public void say(){
		System.out.println("编外的bean，但是也被Spring管理起来了");
	}
}
