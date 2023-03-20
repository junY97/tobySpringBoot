package com.api.tobyspringboot.config;

import com.api.tobyspringboot.config.autoconfig.DispatcherServletConfig;
import com.api.tobyspringboot.config.autoconfig.TomcatWebServerConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author junyeong.jo .
 * @since 2023-03-20
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({DispatcherServletConfig.class, TomcatWebServerConfig.class})
public @interface EnableMyAutoConfiguration {
}
