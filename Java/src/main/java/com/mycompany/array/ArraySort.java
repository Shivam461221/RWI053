
package com.mycompany.array;

public class ArraySort {
    public static void ascending(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
     public static void descending(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
         for (int i : arr) {
             System.out.println(i);
         }
    }
     
     public static void main(String[] args) {
        int[] arr={3,2,4,5,6,7,1,8};
         descending(arr);
    }
}
