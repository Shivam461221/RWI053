
package com.mycompany.array;

public class LeftShift {
    public static void rotateLeft(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            int j,first;
            first=arr[0];
            for ( j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
    }
    public static void rotateRight(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            int j,last;
            last=arr[arr.length-1];
            for ( j = arr.length-1; j>0; j--) {
                arr[j]=arr[j-1];
            }
            arr[j]=last;
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("Before rotate");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println("\nAfter rotate");
       // rotateLeft(arr, 1);
        rotateRight(arr, 2);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
