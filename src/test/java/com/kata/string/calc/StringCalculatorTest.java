package com.kata.string.calc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Before
    public void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void testEmptyStringReturnsZero() {
        int sum = stringCalculator.generateSum("");
        assertEquals("The sum should be 0 as an empty string was used", 0, sum);
    }

    @Test
    public void testNullNumbersStillReturnsMinusOne() {
        int sum = stringCalculator.generateSum(null);
        assertEquals("The sum should be -1 as a null string was used", -1, sum);
    }
}
