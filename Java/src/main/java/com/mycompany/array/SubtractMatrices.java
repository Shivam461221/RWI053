
package com.mycompany.array;

public class SubtractMatrices {
     public static void main(String[] args) {
        int a1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int a2[][]={{2,3,1},{5,4,2},{2,3,1}};
        
        int a3[][]=new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a3[i][j]=a1[i][j]-a2[i][j];
                System.out.print(a3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
