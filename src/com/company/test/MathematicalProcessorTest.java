package com.company.test;

import com.company.MathematicalProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathematicalProcessorTest {

    @Test
    void sin() {
    }

    @Test
    void fact() {
        Assertions.assertEquals(1, MathematicalProcessor.fact(0));
    }
}