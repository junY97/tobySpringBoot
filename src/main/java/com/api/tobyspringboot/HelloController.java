package com.api.tobyspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

/**
 * @author junyeong.jo .
 * @since 2023-03-14
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }
    @GetMapping
    @ResponseBody
    public String hello(String name) {
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
