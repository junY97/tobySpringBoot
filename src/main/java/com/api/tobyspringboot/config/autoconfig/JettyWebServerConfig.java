package com.api.tobyspringboot.config.autoconfig;

import com.api.tobyspringboot.config.MyAutoConfiguration;
import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

/**
 * @author junyeong.jo .
 * @since 2023-03-21
 */
@MyAutoConfiguration
public class JettyWebServerConfig {
    @Bean("JettyWebServerConfig")
    public ServletWebServerFactory servletWebServerFactory() {
        return new JettyServletWebServerFactory();
    }
}
