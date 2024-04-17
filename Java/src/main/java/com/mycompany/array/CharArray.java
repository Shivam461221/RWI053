
package com.mycompany.array;
//check in char array if first and last character is same or not
public class CharArray {
    public static void main(String[] args) {
        char arr[]={'a','e','s','d','i'};
        
        if(arr[0]==arr[arr.length-1]){
            System.out.println("First last characters are same");
        }else{
            System.out.println("They are different");
        }
    }
}
