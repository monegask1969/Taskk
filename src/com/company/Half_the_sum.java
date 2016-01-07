package com.company;

import java.util.ArrayList;

/**
 * Created by Max on 06.01.2016.
 */
public class Half_the_sum {
    public static void half_the_sum(int[] arr){
        ArrayList<Integer> result = new ArrayList();
        for(int i=1; i<arr.length-1; i++){
            if(arr[i] == (arr[i-1] + arr[i+1])/2){
                result.add(arr[i]);
            }
        }
        System.out.println("Half the sum numbers: " + result);
        }
    }