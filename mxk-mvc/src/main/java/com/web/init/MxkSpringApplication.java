package com.web.init;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import java.io.File;

/**
 * @ClassName MxkSpringApplication
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/1 10:58
 **/
public class MxkSpringApplication {

	public static void run() throws ServletException, LifecycleException {


		// 准备Spring ioc 环境
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

		context.register(AppConfig.class);
		context.refresh();

		File base = new File(System.getProperty("java.io.tmpdir"));
		// 准备spring web环境(一直到Tomcat.addServlet(rootCtx,"mxk",dispatcherServlet).setLoadOnStartup(0);，就准备好了)
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9099);

		/**
		* addWebapp 表示这是一个 web 项目
		 * contextPath  tomcat 的访问路径
		 * docBase  项目的 web 目录
		 * 所以这里不能用 addWebapp （SpringBoot 当中也没有这么做）
		*/
//		tomcat.addWebapp("/",base.getAbsolutePath());
		Context rootCtx = tomcat.addContext("/",base.getAbsolutePath());

		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

		// setLoadOnStartup 表示 tomcat 启动过程当中就会调用 DispatcherServlet 的 init 方法
		// 初始化 controller 和请求映射
		Tomcat.addServlet(rootCtx,"mxk",dispatcherServlet).setLoadOnStartup(1);

//		rootCtx.addServletMapping("/","mxk");

		tomcat.start();
		tomcat.getServer().await();



	}
}
