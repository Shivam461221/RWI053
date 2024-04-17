
package com.mycompany.array;

public class RemoveDuplicate {
    public static int removeDuplicate(int[] arr, int n){
       if(n==0 || n==1){
           return n;
       }
       int[] temp = new int[n];
       int j=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        temp[j++]=arr[n-1];
     
        for (int i = 0; i < j; i++) {
            arr[i]=temp[i];
        }
        return j;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,5,3,6,6};
        int length = arr.length-1;
        BubbleSort s=new BubbleSort();
        s.sort(arr);
        
        length=removeDuplicate(arr,length );
        for (int i = 0; i < length-1; i++) {
            System.out.println(arr[i]);
        }
    }
}
