
package com.mycompany.railworldbasics;
//this can be used to refer current class instance variable.
//this can be used to invoke current class method (implicitly)
//this() can be used to invoke current class constructor.
//this can be passed as an argument in the method call.
//this can be passed as argument in the constructor call.
//this can be used to return the current class instance from the method.
public class ThisKeyword {
    int id;
    String name;
    
    public ThisKeyword(){
        this(1,"Shiv");  //invoke parameterized constru. from default constructor
        System.out.println("Default constructor");
        
    }
    
    public ThisKeyword(int id, String name){
           //invoke current class constructor
        this.id=id;   //invoke current class instance variable
        this.name=name;
        
    }
    
    ThisKeyword getThis(){
        return this;
    }
    void msg(){
        System.out.println("Reurning statement from method");
    }
    
    void display(){
        System.out.println("Id: "+id+" Name: "+name);
        this.m(this);   //invoke current class method
    }
    
    void m(ThisKeyword t){ //to pass as an argument in the method
        System.out.println("method invoked");
        
    }
    
    public static void main(String[] args) {
       ThisKeyword t1 = new ThisKeyword();
        t1.display();
        new ThisKeyword().getThis().msg();
   }
}
