package com.mycompany.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) {

        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream("G:/emp.ser");
            oos = new ObjectOutputStream(fos);
            
            Employee emp = new Employee(1, "Shivam",10200,12345);
            oos.writeObject(emp);
            System.out.println("Employee Object Serialized");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
