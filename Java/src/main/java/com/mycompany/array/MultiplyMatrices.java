
package com.mycompany.array;

public class MultiplyMatrices {
     public static void main(String[] args) {
        int a1[][]={{1,2,3},{4,5,6},{1,2,2}};
        int a2[][]={{2,3,1},{5,4,2},{2,3,1}};
        
        int row1=a1.length;
        int col1=a1[0].length;
        
        int row2=a2.length;
        int col2=a2[0].length;
        if(row1!=col2){
            System.out.println("matrices can not be multiplied");
        }else{
        int a3[][]=new int[row1][col2];
        
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < row2; k++) {
                        a3[i][j]=a3[i][j]+a1[i][k]+a2[k][j];
                    }
                }
            }
            
            System.out.println("Product");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(a3[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
