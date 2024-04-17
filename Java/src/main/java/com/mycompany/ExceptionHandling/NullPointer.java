//NullPointer exception occurs when we try to access object's method without creating its instance
package com.mycompany.ExceptionHandling;

public class NullPointer {
   static ArrayIndexOOB a;
   
    public static void main(String[] args) {
        //a= new ArrayIndexOOB();  instance of a
        try{
        NullPointer.a.method1();
        }catch(NullPointerException e){
            System.out.println("Please create intsance of 'a' first");
        }
        
        System.out.println("more code");
    }
}
