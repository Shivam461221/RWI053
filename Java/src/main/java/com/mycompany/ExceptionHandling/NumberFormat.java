package com.mycompany.ExceptionHandling;
//Number format exception thrown when we try to parse string 
public class NumberFormat {
    public static void main(String[] args) {
        String s = "abcd";
        try{
        int i = Integer.parseInt(s);
        }
        catch(NumberFormatException e){
        System.out.println("Please Enter a number");
        }
        System.out.println("More code");
    }
}
