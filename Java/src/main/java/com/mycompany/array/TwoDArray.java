package com.mycompany.array;

public class TwoDArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        
       //System.out.println(arr[0][0]);
        
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        
        for(int[] arr1: arr){
            for(int i:arr1){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
