
package com.mycompany.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
    int id;
    String name;
    double salary;
    transient int ssn;   //transient keyword is used to mark fiels so it will not be serialized

    public Employee(int id, String name, double salary, int ssn) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.ssn = ssn;
    }
    
    
}
