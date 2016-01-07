package com.company;

import java.util.ArrayList;

/**
 * Created by Max on 06.01.2016.
 */
public class Happy_numbers {
    public static void happy_numbers(int[] arr) {
        String number;
        int sum1 = 0;     //сумма первых 3-х
        int sum2 = 0;     //сумма вторых 3-х
        System.out.println("These numbers are happy: ");
        for (Integer sourceNumber : arr) {
            number = sourceNumber.toString();
            sum1 = number.charAt(0) + number.charAt(1) + number.charAt(2);
            sum2 = number.charAt(3) + number.charAt(4) + number.charAt(5);
            if (sum1 == sum2) {
                System.out.println(sourceNumber);
            }
        }

    }
}
