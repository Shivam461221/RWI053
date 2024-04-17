/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.railworldbasics;

import java.lang.reflect.Constructor;

public class Object {
    String s1="object";
    
    public static void main(String[] args) {
        Object obj1= new Object();  //with new keyword
        System.out.println(obj1.s1+" first way");
        try{
        Object obj2 = Object.class.newInstance();   //with newInstancemethod
            System.out.println(obj2.s1+" second way");
            
            Constructor<Object> obj = Object.class.getConstructor();
            Object obj3 = obj.newInstance();
            System.out.println(obj3.s1+" third way"); //with newInstance method of Constructor class
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
