package com.mxk.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName CustomizedBeanProcessor
 * @Description Bean 级别的后置处理器
 * @Author ma.kangkang
 * @Date 2020/11/10 16:58
 **/
@Configuration
public class CustomizedBeanPostProcessor implements BeanPostProcessor {

	/**
	* Bean 初始化以前调用
	*/
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "调用了 postProcessBeforeInitialization() ");
		return bean;
	}

	/**
	 * Bean 初始化以后调用
	 */
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName + "调用了 postProcessAfterInitialization() ");
		return bean;
	}

}
