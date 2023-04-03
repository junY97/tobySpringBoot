package com.api.tobyspringboot.config.autoconfig;

import com.api.tobyspringboot.config.ConditionalMyOnClass;
import com.api.tobyspringboot.config.MyAutoConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

/**
 * @author junyeong.jo .
 * @since 2023-03-20
 */
@MyAutoConfiguration
@ConditionalMyOnClass("org.apache.catalina.startup.Tomcat")
public class TomcatWebServerConfig {
    @Value("${contextPath}")
    String contextPath;

    @Bean("TomcatWebserverConfig")
    @ConditionalOnMissingBean
    public ServletWebServerFactory servletWebServerFactory() {
        TomcatServletWebServerFactory webServerFactory = new TomcatServletWebServerFactory();
        webServerFactory.setContextPath(this.contextPath);
        return webServerFactory;
    }
}
