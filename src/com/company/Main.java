package com.company;

import java.util.Scanner;

import static com.company.Odd_even.odd_even;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter quantity of numbers: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter numbers: ");
        for(int i=0; i<n;i++){
            arr[i]=scan.nextInt();
        }
        odd_even(arr,n);
    }
}
