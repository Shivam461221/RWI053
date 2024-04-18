
package com.mycompany.enums;

public enum PaymentTypes {
    DEBITCARD(5), CREDITCARD(7), CASH(10);
    
    int fee;
    
    PaymentTypes(int fee){
        this.fee=fee;
    }
    
    public int getFee(){
        return this.fee;
    }
}
