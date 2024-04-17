
package com.mycompany.string;

public class StringPoolDemo {
    public static void main(String[] args) {
        Product p1 = new Product(1,"abc");
        Product p2 = new Product(1,"abc");
        
        System.out.println(p1);
        System.out.println(p2);
        
        String s1="abc";
        String s2="abc";
        String s3=new String("abc");
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        
        System.out.println(s1==s2); //checks refernce or memory location
        System.out.println(s1.equals(s2));//checks value or content
        
        System.out.println(s1==s3);
        
        System.out.println(p1.equals(p2));  //equals by default checks memory location but only in case of string it checks value
        
    }
}
