package com.kata.string.calc;

public class StringCalculator {
    
    public int generateSum(String numbersString) {
        if(numbersString == null) {
            return -1;

        }
        if (numbersString.length() > 0 ) {
            return Integer.valueOf(numbersString);
        }
        return 0;
    }
}
