package com.ksatria.spring_basic;

import com.ksatria.spring_basic.configuration.BeanConfiguration;
import com.ksatria.spring_basic.configuration.DuplicateConfiguration;
import com.ksatria.spring_basic.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

public class DuplicateTest {
    @Test
    void testDuplicate() {
        ApplicationContext context = new AnnotationConfigReactiveWebApplicationContext(DuplicateConfiguration.class);

        // error: akses duplicate bean without specifying the bean's name
        // Foo foo = context.getBean(Foo.class);

        // ini artinya no unique bean definition, artinya ada beberapa bean dengan type data yang sama
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
        });
    }

    @Test
    void testGetBean() {
        ApplicationContext context = new AnnotationConfigReactiveWebApplicationContext(DuplicateConfiguration.class);

// mengakses duplicate bean
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        // result: jadi foo1 dan foo2 itu merupakan object bean yang berbeda, karena menggunakan nama bean/ method yang berbeda

        Assertions.assertNotSame(foo1, foo2);
    }
}
