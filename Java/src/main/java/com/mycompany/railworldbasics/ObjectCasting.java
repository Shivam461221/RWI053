
package com.mycompany.railworldbasics;

public class ObjectCasting {
    public static void main(String[] args) {
        Overloading  o1 = new Overriding();  //Upcasting
        o1.m1();
        
        Overriding c = (Overriding)o1;  //Downcasting
        c.m1();
        
        
    }
}
