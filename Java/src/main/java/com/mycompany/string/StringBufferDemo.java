
package com.mycompany.string;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        
        System.out.println("Initial Capacity "+sb.capacity());
        
        sb.append("Hello I am stringbuffer.");
        sb.append(" I am string cousin");
        System.out.println(sb);
        System.out.println("Current capacity "+sb.capacity());
        
        StringBuffer sb2 = new StringBuffer("abcd");
        System.out.println(sb2.reverse());
        
        System.out.println(sb2.insert(2, "hi"));
        System.out.println(sb2.delete(2, 4));
                
    }
}
