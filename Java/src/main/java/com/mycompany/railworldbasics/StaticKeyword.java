
package com.mycompany.railworldbasics;
//The static can be:
//Variable (also known as a class variable)
//Method (also known as a class method)
//Block
//Nested class
public class StaticKeyword {
    static int a =10;
    
    static void print(){
        System.out.println("this is a static method");
    }
    
    static{
        System.out.println("This is a static block it will invoke before main method");
    }
    
    public static void main(String[] args) {
        print();
        
        System.out.println("static variavle "+a);
    }
    
// The static method can not use non static data member or call non-static method directly.
//this and super cannot be used in static context.
}
