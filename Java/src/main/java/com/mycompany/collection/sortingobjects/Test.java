
package com.mycompany.collection.sortingobjects;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<>(new EmployeeNameComparator());
        set.add(new Employee(5, "Mansi"));
        set.add(new Employee(3, "Akku"));
        set.add(new Employee(1, "Parul"));
        set.add(new Employee(15, "Aakash"));
        
        for (Employee employee : set) {
            System.out.println(employee.id);
            System.out.println(employee.name);
        }
    }
}
