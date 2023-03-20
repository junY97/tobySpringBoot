package com.api.tobyspringboot;

import com.api.tobyspringboot.helloboot.HelloController;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * @author junyeong.jo .
 * @since 2023-03-15
 */
public class HelloControllerTest {
    @Test
    void helloController() {
        HelloController helloController = new HelloController(name -> name);

        String ret = helloController.hello("Test");

        assertThat(ret).isEqualTo("Test");

    }

    @Test
    void failHelloController() {
        HelloController helloController = new HelloController(name -> name);

        assertThatThrownBy(()-> {
            helloController.hello(null);
        }).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(()-> {
            helloController.hello("");
        }).isInstanceOf(IllegalArgumentException.class);

    }
}
