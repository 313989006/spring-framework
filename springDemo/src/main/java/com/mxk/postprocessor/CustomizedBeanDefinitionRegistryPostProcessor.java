package com.mxk.postprocessor;

import com.mxk.entity.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName 自定义 CustomizedBeanDefinitionRegistryPostProcessor
 * @Description 实现 BeanDefinitionRegistryPostProcessor 接口，向容器注册额外的 BeanDefinition 实例
 * @Author ma.kangkang
 * @Date 2020/11/10 16:22
 **/
// CustomizedBeanDefinitionRegistryPostProcessor 也需要成为 Bean 才能和容器对话，所以需要加上 @Configuration 标签，或者 @Bean标签
@Configuration
public class CustomizedBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		Class<?> clazz = User.class;
		// 用 BeanDefinitionBuilder 包装 User 对象
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(clazz);
		// 获取User 对应的 GenericBeanDefinition 实例
		GenericBeanDefinition definition = (GenericBeanDefinition) builder.getRawBeanDefinition();
		// 使用 registry 注册 beanDefinition 实例
		registry.registerBeanDefinition("user5",definition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
