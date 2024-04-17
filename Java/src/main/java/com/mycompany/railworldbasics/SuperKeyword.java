
package com.mycompany.railworldbasics;
//super can be used to refer immediate parent class instance variable.
//super can be used to invoke immediate parent class method.
//super() can be used to invoke immediate parent class constructor.
public class SuperKeyword extends ObjectClass{
    
    SuperKeyword(int id, String name){
        super(id, name); //invoking parent class constructor
    }
    
    void show(){
        System.out.println(super.name);  //refering parent class instance variable
        super.print();  //invoking parent class method
    }
    
    public static void main(String[] args) {
        SuperKeyword s1 = new SuperKeyword(3, "Ashish");
        s1.show();
        
    }
    
    
}
