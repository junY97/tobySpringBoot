package com.api.tobyspringboot.helloboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author junyeong.jo .
 * @since 2023-03-15
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@UnitTest
@interface FastUnitTest {}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Test
@interface UnitTest {

}

public class HelloApiTest {
    @UnitTest
    void helloApi() {
        // http localhost:8080/hello?name=Spring
        TestRestTemplate rest = new TestRestTemplate();
        ResponseEntity<String> res = rest.getForEntity("http://localhost:8080/app/hello?name={name}", String.class, "Spring");

        // status 200
        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.OK);
        // header(content-type) text/plain
        assertThat(res.getHeaders().getFirst(HttpHeaders.CONTENT_TYPE)).startsWith(MediaType.TEXT_PLAIN_VALUE);
        // body Hello Spring
        assertThat(res.getBody()).isEqualTo("*Hello Spring*");

    }

    @FastUnitTest
    void failsHelloApi() {
        TestRestTemplate rest = new TestRestTemplate();

        ResponseEntity<String> res = rest.getForEntity("http://localhost:8080/app/hello?name=", String.class);

        assertThat(res.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
