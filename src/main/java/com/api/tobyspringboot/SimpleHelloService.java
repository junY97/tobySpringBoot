package com.api.tobyspringboot;

import org.springframework.stereotype.Component;

/**
 * @author junyeong.jo .
 * @since 2023-03-14
 */
@Component
public class SimpleHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
