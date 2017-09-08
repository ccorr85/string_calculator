package com.kata.string.calc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringCalculatorTest {

    @Test
    public void testEmptyStringReturnsZero() {
        StringCalculator stringCalculator = new StringCalculator();
        int sum = stringCalculator.generateSum("");
        assertEquals("The sum should be 0 as an empty string was used", 0, sum);
    }
}
