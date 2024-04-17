/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

public class Test {
    public static void main(String[] args) {
        B obj = new B(1, "Shivam");
        
        obj.print();
        obj.getData();
        obj.show();
        
        C c = new C(2, "Ashish");
        
        c.print();
        c.getData();
    }
}
