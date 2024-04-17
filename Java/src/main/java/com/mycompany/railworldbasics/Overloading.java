
package com.mycompany.railworldbasics;

public class Overloading {
    String name;
    
    //constructor overloading
    
    public Overloading(){
        System.out.println("parent ");
        name="Hello";
    }
    
    public Overloading(String name){
        this.name= name;
    }
    
    public void m1(){
        System.out.println("Parent class");
    }
    
    public static void main(String[] args) {
        Overloading o1 = new Overloading();
        Overloading o2 = new Overloading("Shivam");
        
        System.out.println(o1.name);
        System.out.println(o2.name);
        
        
        
    }
}
