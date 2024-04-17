
package com.mycompany.polymorphsim;
//when a class contains methods with same name and different return type or 
//different parameters is called method overloading
public class Overloading {
    int sum(int a, int b){
        return a+b;
    }
    
    double sum(double a, double b){
        return a+b;
    }
    
    void show(){
        System.out.println("parent class");
    }
    
    public static void main(String[] args) {
        Overloading a = new Overloading();
        System.out.println(a.sum(10, 5));
        System.out.println(a.sum(10, 20));
    }
}
