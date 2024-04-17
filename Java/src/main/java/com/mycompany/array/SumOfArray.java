
package com.mycompany.array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int sum =0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
            sum+=arr[i];
            }
        }
        System.out.println("Sum of possitive numbers in array "+sum);
    }
}
