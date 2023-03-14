package com.api.tobyspringboot;

import java.util.Objects;

/**
 * @author junyeong.jo .
 * @since 2023-03-14
 */
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    public String hello(String name) {
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
