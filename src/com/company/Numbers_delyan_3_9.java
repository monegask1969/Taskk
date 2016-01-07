package com.company;

import java.util.ArrayList;

/**
 * Created by Max on 06.01.2016.
 */
public class Numbers_delyan_3_9 {
    public static void numb_delyan_3_9(int[] arr){
        ArrayList<Integer> devided_3 = new ArrayList();
        ArrayList <Integer> devided_9 = new ArrayList();
        int quant_nul=0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]==0){
                quant_nul+=1;
            }
            else if(arr[i] % 3 == 0){
                devided_3.add(arr[i]);
            }
            if(arr[i]==0){
                quant_nul+=1;
            }
            else if (arr[i] % 9 == 0){
                devided_9.add(arr[i]);
            }
        }
        System.out.println("Numbers that are divisible by 3: ");
        for (Integer numb:devided_3){
            System.out.println(numb);
        }
        System.out.println("Numbers that are divisible by 9: ");
        for(Integer numb:devided_9){
            System.out.println(numb);
        }
        System.out.println("Quantity of nulls: " + quant_nul/2);
    }
}
