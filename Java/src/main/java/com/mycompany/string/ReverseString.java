
package com.mycompany.string;

public class ReverseString {
    public String firstWay(String actual){
        String reversed = "";
        for(int i=actual.length();i>0;i--){
            reversed = reversed+actual.charAt(i-1);
        }
        return reversed;
    }
    
    public String secondWay(String actual){
        byte[] s1 = actual.getBytes();
        byte[] s2=new byte[s1.length];
        
        for (int i = 0; i < s1.length; i++) {
            s2[i]=s1[s1.length-i-1]; 
        }
        
        String reversed = new String(s2);
        
        return reversed;
    }
    
    public static void main(String[] args) {
        String s1="hello";
        
        ReverseString obj=new ReverseString();
        System.out.println(obj.secondWay(s1));
   
//        char arr[] = new char[s1.length()];   
//        for (int i = 0; i < s1.length(); i++) {
//            arr[i]=s1.charAt(i);
//        }
//        
//        String revStr="";
//        
//        for (int i =arr.length-1; i>=0; i--) {
//            revStr=revStr.concat(String.valueOf(arr[i]));
//        }
//        
//        System.out.println(revStr);
    }
}
