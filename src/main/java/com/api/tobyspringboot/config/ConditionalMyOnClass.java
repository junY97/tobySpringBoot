package com.api.tobyspringboot.config;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author junyeong.jo .
 * @since 2023-03-22
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Conditional(MyOnClassCondition.class)
public @interface ConditionalMyOnClass {
    String value();
}
