package com.mycompany.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Student {

    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }
    
    public static void main(String[] args) {
        Student s1 = new Student(1, "Shiv");
        Student s2 = new Student(2, "sourabh");
        Student s3 = new Student(3, "madhu");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);

        for (Student student : list) {
            System.out.println(student);
        }
        ListIterator<Student> itr = list.listIterator();
        
//        while(itr.hasPrevious()){
//            System.out.println(itr.previous());
//        }
    }
}
