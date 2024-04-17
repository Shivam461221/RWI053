package com.mycompany.IOstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(new File("G:/Stopwords.txt"));
            System.out.println("File Opened");
            int i;
            while ((i = file.read()) != -1) {
                System.out.print((char)i);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO exception");
        } finally{
            try {
                file.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
            System.out.println("File closed");
        }
    }
}
