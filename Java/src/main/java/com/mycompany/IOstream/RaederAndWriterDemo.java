package com.mycompany.IOstream;
import java.io.FileReader;
import java.io.FileWriter;
public class RaederAndWriterDemo {

    public static void main(String[] args) throws Exception {
        FileReader fr = null;
        FileWriter fw = null;
        
        fr=new FileReader("G:/symbols.txt");
        fw=new FileWriter("G:/newsymbols.txt");
        
        int ch;
        while((ch=fr.read())!=-1){
            fw.write(ch);
        }
        
        fr.close();
        fw.close();
    }
}
