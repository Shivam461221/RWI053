
package com.mycompany.array;

public class InsertionSort {
    
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; ++i) {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                
                j=j-1;
            }
        }
    }
    public static void main(String[] args) {
        int[] list = {10, 7, 4, 6, 2, 1, 3};

        InsertionSort sort = new InsertionSort();
        sort.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
