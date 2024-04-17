
package com.mycompany.array;
//replace the 5 which followed by 3 with 0
public class ArrayPrograms {
    public static void main(String[] args) {
        int arr[]= {5,3,5,7,6,3,5};
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==3 && arr[i+1]==5){
                arr[i+1]=0;
            }
        }
        
        for(int i:arr){
            System.out.println(i);
        }
    }
}
