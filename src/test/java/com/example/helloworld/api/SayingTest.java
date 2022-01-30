package com.example.helloworld.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SayingTest {

    @Test
    void testCreate() {
        Saying saying = new Saying(1, "Hello TEST");
        assertEquals(1, saying.getId());
        assertEquals("Hello TEST", saying.getContent());
        assertEquals(0, saying.getHistory().size());
    }

}