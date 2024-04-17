
package com.mycompany.array;

public class OddAndEvenFreq {
    public static void main(String[] args) {
         int a[][]={{1,2,1},{2,2,2},{3,3,3}};
         
         int odd=0;
         int even=0;
         
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 if(a[i][j]%2==0){
                     even++;
                 }else{
                     odd++;
                 }
             }
        }
         
         System.out.println("Odd "+ odd);
         System.out.println("Even "+even);
    }
}
