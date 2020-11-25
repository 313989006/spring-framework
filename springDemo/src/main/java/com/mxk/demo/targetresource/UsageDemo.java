package com.mxk.demo.targetresource;

import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.target.SingletonTargetSource;

/**
 * @ClassName UsageDemo
 * @Description TargetSource 的使用例子
 * @Author ma.kangkang
 * @Date 2020/11/23 16:52
 **/
public class UsageDemo {


	public static void main(String[] args) throws Exception {

		Target target = new Target();
		TargetSource source = new SingletonTargetSource(target);
		// 使用 SpringAOP 框架的代理工厂直接创建代理对象
		Target proxy = (Target) ProxyFactory.getProxy(source);

		System.out.println("getName(): " + proxy.getClass().getName());
		System.out.println("getTargetClass() : " + source.getTargetClass());
		System.out.println("getTarget() : " + source.getTarget());
		System.out.println("isStatic(): " + source.isStatic());

		// 打印结果
		// getName(): com.mxk.demo.targetresource.Target$$EnhancerBySpringCGLIB$$c2b45234：说明是使用的 CGLIB 动态代理
		// getTargetClass() : class com.mxk.demo.targetresource.Target
		// getTarget() : com.mxk.demo.targetresource.Target@799d4f69
		// isStatic(): true ：因为 source 是单例的

	}
}
