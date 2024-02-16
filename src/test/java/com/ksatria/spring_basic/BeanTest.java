package com.ksatria.spring_basic;

import com.ksatria.spring_basic.configuration.BeanConfiguration;
import com.ksatria.spring_basic.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;

public class BeanTest {
    @Test
    void testCreateBean() {
        ApplicationContext context = new AnnotationConfigReactiveWebApplicationContext(BeanConfiguration.class);

        Assertions.assertNotNull(context);
    }

    @Test
    void testGetBean() {
        ApplicationContext context = new AnnotationConfigReactiveWebApplicationContext(BeanConfiguration.class);

        /*
        * getBean(Foo.class) artinya mencari Bean yang data typenya Foo,
        ini mengembalikan object yang sama, karena ini merupakan singleton
        bukan berarti method yang ada di dalam configuration yang di eksekusi,
        methodnya itu sebenaarnya dieksekusi di awal,
        bahkan sebelum getbean dipanggil, itu sudah dipanggil methodnya

        jadi dipanggil dulu method getBean, dimasukkan applicationContext,
        dipanggil atau tidak dipanggil, object getBean sudah ada di dalam Application Context

        * */
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);

        Assertions.assertSame(foo1, foo2);
    }
}
