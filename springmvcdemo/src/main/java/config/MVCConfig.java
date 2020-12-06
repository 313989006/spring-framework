package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @ClassName MVCConfig
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/6 17:01
 **/
//DispatcherServlet 中上下文相关的 bean
@Configuration
@ComponentScan("controller")
// 开启容器的 MVC 功能
@EnableWebMvc
public class MVCConfig {

	// @Bean 的作用：Spring 容器会在启动并读入 MVCConfig 的配置类的时候，去调用 viewResolver () 将方法的返回值作为 Bean 存入到容器中
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		// 给视图解析器加上设置好的路径前后缀
		internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}
}