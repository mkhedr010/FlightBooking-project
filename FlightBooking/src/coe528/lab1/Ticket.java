/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author mbkr
 */
public class Ticket {
  private  Passenger passenger;
  private Flight flight;
 private   double price;
  private  int  num;
  private static int count =0 ;
  public Ticket(Passenger passenger,   Flight flight ,double price)
  { this.passenger = passenger;
  this.flight = flight;
  this.price = price;
  count++;
  num =  count;
  }

    /**
     * @return the passenger
     */
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     * @param passenger the passenger to set
     */
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    /**
     * @return the flight
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * @param flight the flight to set
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }
    @Override
    
    public String toString(){
            return " "+ passenger.getName() +", "+ flight + " ticket price: " + price + "$";
    }
    
}
