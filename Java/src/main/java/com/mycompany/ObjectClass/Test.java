package com.mycompany.ObjectClass;

public class Test {

    public static void main(String[] args) {
        Passenger passenger = new Passenger();

        passenger.setFirstName("Shivam");
        passenger.setLastName("Lowanshi");
        passenger.setId(123);

        System.out.println(passenger);

        System.out.println(passenger.hashCode());// it is the address where a particular object stores in memory

        System.out.println(passenger.hashCode());

        Passenger passenger2 = new Passenger();

        passenger2.setFirstName("Shivam");
        passenger2.setLastName("Lowanshi");
        passenger2.setId(123);

        System.out.println(passenger.equals(passenger2));
        System.out.println(passenger==passenger2);
        //the equals method is used to check two objects are equal it returns boolean value
        //and in String, StringBuffer and Wrapper class it compares the content 
    }
}
