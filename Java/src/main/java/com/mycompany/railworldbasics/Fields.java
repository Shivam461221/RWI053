/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.railworldbasics;

public class Fields {
    String name;
    public void printName() {
        System.out.println(name);
    }
    static{
        System.out.println("Static block");
    }
     Fields(String name) {
        this.name=name;
    }

    public static void main(String[] args) {
        Fields f1=new Fields("Shivam");
        f1.printName();
    
}
}
