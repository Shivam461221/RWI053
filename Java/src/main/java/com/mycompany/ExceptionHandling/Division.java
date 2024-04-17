//Arithmetic exception occurs when we try to divide number by 0
package com.mycompany.ExceptionHandling;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b=sc.nextInt();
        try{
        c=a/b;
        System.out.println("Result is "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Do not divide with Zero");
        }
        System.out.println("More code ");
    }
}
