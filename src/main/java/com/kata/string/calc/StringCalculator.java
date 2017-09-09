package com.kata.string.calc;

public class StringCalculator {

    private static final String NUMBER_SEPARATOR = ",";
    
    public int generateSum(String numbersString) {
        if(numbersString == null) {
            System.out.println("No sum could be generated as the value is null");
            return -1;

        }
        if (numbersString.length() > 0 ) {
            int sum = 0;
            String[] numbers = numbersString.split(NUMBER_SEPARATOR);
            for (String number : numbers) {
                try {
                    sum += Integer.valueOf(number.trim());
                } catch (NumberFormatException e) {
                    System.out.print(e.getMessage());
                }

            }
            return sum;
        }
        return 0;
    }
}
