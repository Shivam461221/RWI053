package com.mycompany.array;

public class SelectionSort {

    public void sort(int[] arr) {
        int min, temp, size=arr.length; 
        for (int i = 0; i < arr.length-1; i++) {
            min=i;
            for (int j = i+1; j < size; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }

    public static void main(String[] args) {
        int[] list = {10, 7, 4, 6, 2, 1, 3};

        SelectionSort sort = new SelectionSort();
        sort.sort(list);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
