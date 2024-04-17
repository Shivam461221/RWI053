
package com.mycompany.array;

public class Binarysearch {
    
    public static int binarySearch(int arr[], int num, int low, int high){
        while(low<=high){
            int mid = (high+low)/2;
            
            if(arr[mid]==num){
                return mid;
            }else if(arr[mid]<num){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         int arr[] = {10, 20, 30, 40, 50, 70,90,100};
        int index = binarySearch(arr, 50, 0, arr.length-1);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
