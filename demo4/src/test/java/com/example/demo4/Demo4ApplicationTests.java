package com.example.demo4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo4ApplicationTests {

    @Test
    void contextLoads() {
        Assertions.assertThat("1").isEqualTo("1");
    }

}
