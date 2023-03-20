package com.api.tobyspringboot.config.autoconfig;

import com.api.tobyspringboot.config.MyAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author junyeong.jo .
 * @since 2023-03-20
 */
@MyAutoConfiguration
public class DispatcherServletConfig {
    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }
}
