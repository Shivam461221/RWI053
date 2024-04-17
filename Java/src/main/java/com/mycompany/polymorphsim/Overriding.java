
package com.mycompany.polymorphsim;
//when a child class have method with same name as parent class method this is called method overriding
//Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
//Method overriding is used for runtime polymorphism
public class Overriding extends Overloading{
    
    @Override
    int sum(int a, int b){
        return a+b;
    }
    
    @Override
    void show(){
        System.out.println("Base class");
    }
    public static void main(String[] args) {
        Overriding o = new Overriding();
        System.out.println(o.sum(10, 20));
        o.show();
    }
}
