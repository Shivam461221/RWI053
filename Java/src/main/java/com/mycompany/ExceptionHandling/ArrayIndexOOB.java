//ArrayIndexOOB exception occurs when we try to acces array index beyound its length
package com.mycompany.ExceptionHandling;

public class ArrayIndexOOB {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        try{
        System.out.println("Elements of array are");
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index beyond array length");
            //e.printStackTrace();
        }
        
        System.out.println("More code");
    }
    
    void method1(){
        System.out.println("Method1");
    }
}
