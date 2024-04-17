/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.railworldbasics;

public class Overriding extends Overloading{
    
    String model;
    Overriding (){
        super();
        System.out.println("Child");
    }
       
    @Override
    public void m1(){
        System.out.println("Child class");
    }
    
    public static void main(String[] args) {
        Overriding o1 = new Overriding();
//        o1.m1();
//        o1.Print();
           Overloading o2 = new Overriding();
//        o2.m1();
        
        
    }
}
