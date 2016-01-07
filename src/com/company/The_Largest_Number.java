package com.company;

/**
 * Created by Max on 06.01.2016.
 */
public class The_Largest_Number {
    public static void largest_smallest(int[] arr){
        int largest=0;
        int smallest=0;
        for(int i=0; i<arr.length;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
            else if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("The Largest number: " + largest);
        System.out.println("The smallest number: " + smallest);
    }
}
