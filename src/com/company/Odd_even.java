package com.company;

import java.util.ArrayList;

/**
 * Created by Max on 06.01.2016.
 */
public class Odd_even {
    public static void odd_even(int[] arr, int n){
        ArrayList <Integer> odd = new ArrayList();
        ArrayList <Integer> even = new ArrayList();
        int quant_nul=0;
        for(int i=0; i<n;i++){
            if( arr[i] % 2 == 0){
                odd.add(arr[i]);
            }
            else if(arr[i]==0){
                quant_nul+=1;
            }
            else{
                even.add(arr[i]);
            }
        }
        System.out.println("Odd numbers: ");
        for(Integer numb:odd){
            System.out.println(numb);
        }
        System.out.println("Even numbers: ");
        for(Integer numb:even){
            System.out.println(numb);
        }
        System.out.println("Quantity of nulls: " + quant_nul);
    }
}
