package com.ksatria.spring_basic.configuration;

import com.ksatria.spring_basic.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {

    // create object singleton
    @Bean
    public Foo foo() {
        Foo foo = new Foo();
        // memastikan ini dipanggil atau tidak
        log.info("Create new foo");
        return foo;
    }
}
