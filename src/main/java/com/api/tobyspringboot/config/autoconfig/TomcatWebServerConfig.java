package com.api.tobyspringboot.config.autoconfig;

import com.api.tobyspringboot.config.MyAutoConfiguration;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author junyeong.jo .
 * @since 2023-03-20
 */
@MyAutoConfiguration
@Conditional(TomcatWebServerConfig.TomcatCondition.class)
public class TomcatWebServerConfig {
    @Bean("TomcatWebserverConfig")
    public ServletWebServerFactory servletWebServerFactory() {
        return new TomcatServletWebServerFactory();
    }

    static class TomcatCondition implements Condition {

        @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            return false;
        }
    }
}
