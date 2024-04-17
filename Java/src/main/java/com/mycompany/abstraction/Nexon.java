
package com.mycompany.abstraction;

public class Nexon implements Car {

    @Override
    public void start() {
        System.out.println("Car started"); 
    }

    @Override
    public void engine() {
        System.out.println("1000CC"); 
    }

    @Override
    public void fuel() {
        System.out.println("Petrol");
    }
    
    public static void main(String[] args) {
        Nexon nexon = new Nexon();
        nexon.start();
        nexon.engine();
        nexon.fuel();
    }
   
}
