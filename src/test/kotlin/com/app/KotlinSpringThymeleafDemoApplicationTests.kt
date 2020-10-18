package com.app

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = arrayOf(KotlinSpringThymeleafDemoApplication::class),webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class KotlinSpringThymeleafDemoApplicationTests {

    @Test
    fun contextLoads() {
        val test = 1
        assertEquals(test, 1)
    }

}
