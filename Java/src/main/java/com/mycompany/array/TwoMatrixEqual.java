
package com.mycompany.array;

public class TwoMatrixEqual {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}}; 
        int b[][]={{1,1,1},{3,2,2},{3,3,3}};
        
        boolean flag = true;
        
        int row1=a.length;
        int col1=a[0].length;
        
        int row2=b.length;
        int col2=b[0].length;
        
        if(row1!=row2 || col1!=col2){
            System.out.println("Matrices are not equal");
        }
        else{
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    if(a[i][j]!=b[i][j]){
                        flag=false;
                        break;
                    }
                }
            }
        }
        
        if(flag){
            System.out.println("Matrices are equal");
        }else{
            System.out.println("Matrices are not equal");
        }
    }
}
