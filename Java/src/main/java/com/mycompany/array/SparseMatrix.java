
package com.mycompany.array;

public class SparseMatrix {
    public static void main(String[] args) {
        int arr[][] = {{0,1,1},{0,0,3},{0,1,0}};
        
        int row = arr.length;
        int col = arr[0].length;
        
        int size = row*col;
        int count=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j]==0){
                    count++;
                }
            }
        }
        
        if(count>size/2){
            System.out.println("Its a sparse matrix");
        }else{
            System.out.println("It is not a sparse matrix");
        }
    }
}
