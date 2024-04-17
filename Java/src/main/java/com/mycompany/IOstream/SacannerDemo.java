package com.mycompany.IOstream;

import java.util.Scanner;

public class SacannerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student id, name, score");

        int id = sc.nextInt();
        String name = sc.next();
        double score = sc.nextDouble();

        System.out.println("Student Details");
        System.out.println("Id " + id);
        System.out.println("Name " + name);
        System.out.println("Score " + score);
    }
}
