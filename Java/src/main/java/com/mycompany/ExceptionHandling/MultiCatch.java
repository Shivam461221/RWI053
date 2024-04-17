package com.mycompany.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            c = a / b;
            System.out.println("Result is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Please do not enter zero");
        }
        catch(InputMismatchException e){
            System.out.println("Please inter number");
        }

    }
}
