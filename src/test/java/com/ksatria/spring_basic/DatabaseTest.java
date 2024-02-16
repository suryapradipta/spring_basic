package com.ksatria.spring_basic;

import com.ksatria.spring_basic.singleton.Database;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    @Test
    void testSingleton() {
        // gabisa buat pakai new, karena private
        // var database1 = new Database();

        var database1 = Database.getInstance();
        var database2 = Database.getInstance();

        // pastiin kalo objectnya sama
        Assertions.assertSame(database1, database2);

        /*
        * Sebanyak apapun dibuat object database, hasilnya database itu hanya 1 (singleton), karena menggunakan rules
        * jadi ketika spring membuat object, secara default akan singleton*/



    }
}
