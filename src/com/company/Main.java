package com.company;

import java.util.Scanner;

import static com.company.Half_the_sum.half_the_sum;
import static com.company.Happy_numbers.happy_numbers;
import static com.company.Numbers_delyan_3_9.numb_delyan_3_9;
import static com.company.Numbers_delyan_5_7.numb_delyan_5_7;
import static com.company.Odd_even.odd_even;
import static com.company.The_Largest_Number.largest_smallest;
import static com.company.Triples.triple;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter quantity of numbers: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Разкомментить строку, для использования функции.
        //P.S. Сделал менюшку с выбором для каждого действия, но потом понял, что для некоторых функций нужны различные числа и решил оставить так.


        //odd_even(arr);
        //largest_smallest(arr);
        //numb_delyan_3_9(arr);
        //numb_delyan_5_7(arr);
        //triple(arr);
        //happy_numbers(arr);
        //half_the_sum(arr);
        }
    }

