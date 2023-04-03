package com.api.tobyspringboot.helloboot;

import org.springframework.stereotype.Service;

/**
 * @author junyeong.jo .
 * @since 2023-03-14
 */
@Service
public class SimpleHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
