package com.company;

import java.util.ArrayList;

/**
 * Created by Max on 06.01.2016.
 */
public class Numbers_delyan_5_7 {
    public static void numb_delyan_5_7(int[] arr){
        ArrayList<Integer> devided_5 = new ArrayList();
        ArrayList <Integer> devided_7 = new ArrayList();
        int quant_nul=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==0){
                quant_nul+=1;
            }
            else if(arr[i] % 5 == 0){
                devided_5.add(arr[i]);
            }
            if(arr[i]==0){
                quant_nul+=1;
            }
            else if (arr[i] % 7 == 0){
                devided_7.add(arr[i]);
            }
        }
        System.out.println("Numbers that are divisible by 5: ");
        for (Integer numb:devided_5){
            System.out.println(numb);
        }
        System.out.println("Numbers that are divisible by 7: ");
        for(Integer numb:devided_7){
            System.out.println(numb);
        }
        System.out.println("Quantity of nulls: " + quant_nul/2);
    }
}
