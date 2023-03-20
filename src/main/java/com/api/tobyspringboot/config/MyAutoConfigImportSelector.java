package com.api.tobyspringboot.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author junyeong.jo .
 * @since 2023-03-20
 */
public class MyAutoConfigImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {
                "com.api.tobyspringboot.config.autoconfig.DispatcherServletConfig",
                "com.api.tobyspringboot.config.autoconfig.TomcatWebServerConfig",
        };
    }
}
