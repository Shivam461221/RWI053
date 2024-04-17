package com.mycompany.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Logger;

public class DeserializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("G:/emp.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj = ois.readObject();
        Employee emp = (Employee) obj;

        System.out.println("Id " + emp.id);
        System.out.println("Name " + emp.name);
        System.out.println("Sallary " + emp.salary);
        System.out.println("SSN" + emp.ssn);//ssn is transient thats why its nor serialized

    }
}
