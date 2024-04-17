
package com.mycompany.string;

public class Methods {
    public static void main(String[] args) {
        String s="Railworld company ";
        
        System.out.println("Length of string : "+s.length());
        System.out.println("Index of : "+ s.indexOf('w'));
        System.out.println("CharAt : "+s.charAt(4));
        System.out.println("Substring with beginning index : "+s.substring(3));
        System.out.println("Substring with begin and end : "+s.substring(0, 4));
       
        String[] s2=s.split(" ");
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
        
        System.out.println("Replace character: "+s.replace('l', 'k'));
        
        System.out.println("Replace String : "+s.replace("Rail", "Train"));
        
        System.out.println("Uppercase : "+s.toUpperCase());
        System.out.println("Lowercase : "+s.toLowerCase());
        
        System.out.println("Trim "+s.trim()+"India");
//        int val=30;
//        System.out.println(s+10);
        System.out.println("Contains "+s.contains("Rail"));
        
        String s3="shivam";
        String s4="shivam";
        String s5="Shivam";
        System.out.println("equals "+s3.equals(s4));
        System.out.println("equalIgnoreCase "+s3.equalsIgnoreCase(s5));
        System.out.println("compateTo "+s3.compareTo(s5));
    }
}
