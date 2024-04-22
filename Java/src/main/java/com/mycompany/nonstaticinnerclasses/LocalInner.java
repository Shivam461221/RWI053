package com.mycompany.nonstaticinnerclasses;

public class LocalInner {

    void f1() {
        System.out.println("Inside Outer f1()");

        class Inner {

            void f2() {
                System.out.println("Inside LocalInner f2()");
            }
        }
        Inner inner = new Inner();
        inner.f2();
    }
    
    public static void main(String[] args) {
        LocalInner outer = new LocalInner();
        outer.f1();
    }
}
