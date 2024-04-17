
package com.mycompany.inheritance;
//Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. 
public class A {
    int id = 1;
    String name = "Shivam";
    
    public A(int id, String name){
        this.id=id;
        this.name=name;
    }
    
    public void print(){
        System.out.println("parent class method");
    }
    
    public void getData(){
        System.out.println("Id "+id+" name "+name);
    }
}
