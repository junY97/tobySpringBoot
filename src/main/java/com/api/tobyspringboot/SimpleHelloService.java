package com.api.tobyspringboot;

/**
 * @author junyeong.jo .
 * @since 2023-03-14
 */
public class SimpleHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
