
package com.mycompany.array;
//elements present on odd and even position
public class OddEven {
    public static void odd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void even(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9,10};
        odd(arr);
        System.out.println("\n--------------------");
        even(arr);
    }
}
