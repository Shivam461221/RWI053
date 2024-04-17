package com.mycompany.railworldbasics;

import java.util.Scanner;

public class SumOfAll {

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of possitive numbers in array " + sum);
    }
}
