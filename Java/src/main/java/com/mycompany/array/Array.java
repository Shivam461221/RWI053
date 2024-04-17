package com.mycompany.array;

//Java array is an object which contains elements of a similar data type.
// Additionally, The elements of an array are stored in a contiguous memory location.
public class Array {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};  //declaration, instantiation and initialization

        int arr2[] = new int[5];   //declaration and instantiation
        arr2[0] = 5;
        arr2[1] = 7;
        arr2[2] = 3;
        arr2[3] = 9;
        arr2[4] = 7;
        
       // System.out.println(arr[3]);
        
        for(int i : arr){ //for each method
            System.out.println(i);
        }

    }
}
