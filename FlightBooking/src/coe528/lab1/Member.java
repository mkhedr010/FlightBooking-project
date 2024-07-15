/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author mbkr
 */
public class Member extends Passenger {
    private int yearsOfMembership;
    
    public Member(String name, int age, int yearsOfMembership){
    super(name, age);
    this.yearsOfMembership = yearsOfMembership;
    }
    @Override
     public double applyDiscount(double p){
            System.out.println("Discount Applied!");

         double out=p;
     if(yearsOfMembership>5)
     {
         out = 0.5 * p;
     }
     if (yearsOfMembership>1 && yearsOfMembership<= 5)
     { out = 0.9 * p;}
     return out;
     }
    
}
