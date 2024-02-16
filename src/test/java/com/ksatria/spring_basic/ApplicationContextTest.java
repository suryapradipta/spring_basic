package com.ksatria.spring_basic;

import com.ksatria.spring_basic.configuration.HelloWorldConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;

/*
* Contoh pembuatan ApplicationContext, container
* Pertama buat configuration class, kemugian buat application contextnya*/
public class ApplicationContextTest {
    @Test
    void testApplicationContext() {
        ApplicationContext context = new AnnotationConfigReactiveWebApplicationContext(HelloWorldConfiguration.class);

        Assertions.assertNotNull(context);
    }
}
