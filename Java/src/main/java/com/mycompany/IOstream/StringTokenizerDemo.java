
package com.mycompany.IOstream;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s = "Hello,Railworld,India,Pvt.,Ltd.";
        
        //StringTokenizer st = new StringTokenizer(s,);               //return token based on space delimiter
       // StringTokenizer st = new StringTokenizer(s, ",");       //delimiter e.g.comma ,
        StringTokenizer st = new StringTokenizer(s, ",",true);         // return delimiter along with token
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
