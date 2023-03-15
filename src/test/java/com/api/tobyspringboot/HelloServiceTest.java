package com.api.tobyspringboot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author junyeong.jo .
 * @since 2023-03-15
 */
public class HelloServiceTest {
    @Test
    void simpleHelloTest () {
        SimpleHelloService helloService = new SimpleHelloService();
        String ret = helloService.sayHello("Test");

        assertThat(ret).isEqualTo("Hello Test");

    }
}
