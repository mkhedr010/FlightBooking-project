/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author mbkr
 */
public class NonMember extends Passenger {
        
    public NonMember(String name, int age){
    super(name, age);
    }
    @Override
     public double applyDiscount(double p){
         double out=p;

     if(age>65)
     {
         out = 0.9* p;
                              System.out.println("Discount Applied!");

     }
     return out;
}}
