package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * SpringContext 中相关的 bean
 * @Date 2020/12/6 16:56
 **/
// 扫描除了controller 层以外的 bean
@Configuration
@ComponentScan("service")
public class SpringRootConfig {
}
