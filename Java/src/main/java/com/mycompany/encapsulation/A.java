
package com.mycompany.encapsulation;
//Encapsulation means wrapping of code and data together into a single unit
public class A {
    //A is a fully encapsulated class 
    private int id;
    private String name;

    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    
}
