
package com.mycompany.array;

public class IdentityMatrix {
    public static void main(String[] args) {
        int a[][] = {{1,0,0},{0,1,0},{0,0,1}};
        
        int row=a.length;
        int col=a[0].length;
        boolean flag = true;
        
        if(row!=col){
            System.out.println("Matrix should be square matrix");
        }
        else{
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if(i==j && a[i][j]!=1){
                        flag=false;
                        break;
                    }
                    if(i!=j && a[i][j]!=0){
                        flag=false;
                        break;
                    }
                }
            }
        }
        
        if(flag){
            System.out.println("It is a identity matrix");
        }else{
            System.out.println("It is not a identity matrix");
        }
    }
}
