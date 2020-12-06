package config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * @ClassName StartWebApplicationInitializer
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/6 17:22
 **/
public class StartWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * SpringContext 中相关的 bean
	 * @Param:
	 * @return:
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{SpringRootConfig.class};
	}

	/**
	 * DispatcherServlet 中上下文相关的 bean
	 * @Param:
	 * @return:
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{MVCConfig.class};
	}

	/**
	 * servlet 请求映射路径
	 * @Param:
	 * @return:
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

	/**
	 * 拦截并处理请求的编码
	 * @Param:
	 * @return:
	 */
	@Override
	protected Filter[] getServletFilters(){
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceRequestEncoding(true);
		return new Filter[]{characterEncodingFilter};
	}
}