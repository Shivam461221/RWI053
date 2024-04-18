
package com.mycompany.enums;

public enum Databases {
    
    //enum represents as a class and these constatants are references or objects of particular class 
    MYSQL, ORACLE, SQLSERVER;
    
    //implicitly these are public static and final 
    //we can acces them simply using name of enum 
    
    //every enum internally extends abstract class Enum from java.lang package soit can not extends any other classes
    
    //we can define fields, constructors and methods and even main methods
}
