
package com.mycompany.abstraction;

public class B extends A {
    
    int sum(int a, int b){
     return a+b;   
    }
    
    public static void main(String[] args) {
        
        B obj = new B();
        System.out.println(obj.sum(5, 10));
    }
}
