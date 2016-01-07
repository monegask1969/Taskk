package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max on 06.01.2016.
 */
public class Triples {
    public static void triple(int[] arr){
        String number;
        List<Integer> result = new ArrayList<Integer>();
        for (Integer sourceNumber : arr) {
            number = sourceNumber.toString();
            if (number.length() == 3 && number.charAt(0) != number.charAt(1)
                    && number.charAt(1) != number.charAt(2)
                    && number.charAt(0) != number.charAt(2)) {
                result.add(sourceNumber);
            }
        }
        System.out.println("Three-digit number, in decimal notation which are not identical digits: " + result);
    }
}
