
package com.mycompany.IOstream;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter numbers to calculate sum ");
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            sum+=num;
        }
        
        System.out.println("Sum is: "+sum);
    }
}
