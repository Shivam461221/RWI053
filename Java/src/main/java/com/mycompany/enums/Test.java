
package com.mycompany.enums;

public class Test {
    public static void main(String[] args) {
        PaymentTypes pt = PaymentTypes.DEBITCARD;
        System.out.println(pt);
        
       PaymentTypes[] values= PaymentTypes.values();
        for (PaymentTypes value : values) {
            System.out.println(value);
            System.out.println("position "+value.ordinal());
            System.out.println("Fee "+value.getFee());
        }
    }
}
