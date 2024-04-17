
package com.mycompany.IOstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        
        int count = 0;
        
        try{
            fr = new FileReader("G:/Stopwords.txt");
            br = new BufferedReader(fr);
            
            String line;
            
            while((line=br.readLine())!=null){
                StringTokenizer st = new StringTokenizer(line);
                while(st.hasMoreTokens()){
                    System.out.println(st.nextToken());
                    count++;
                }
            }
            System.out.println("Number of words are : "+count);
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } 
        finally{
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
    }
}
