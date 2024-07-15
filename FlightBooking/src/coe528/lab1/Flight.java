/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

/**
 *
 * @author mbkr
 */
public class Flight {
    
    private int  flightNumber;
private String origin;
private String  destination;
private String  departureTime;
private int  capacity;
private int  numberOfSeatsLeft;
private double  originalPrice;
private  int seatsBooked = 0;
    
public Flight(int fn, String o, String des, String dep, int cap, double op)
{
    if(cap<0 || op<0)
    throw new IllegalArgumentException("Error: price and capacity cannot be negative!");
    flightNumber = fn;
    origin = o;
    destination = des;
    departureTime = dep;
    capacity = cap;
    if (cap < seatsBooked){
        throw new IllegalArgumentException("Error: No seats avilable!");
    }
    numberOfSeatsLeft = cap -seatsBooked;
    originalPrice = op;
     if (des.equals(o)){
        throw new IllegalArgumentException("Error: The Destination cannot be the same as the Origin");
    }
}

    /**
     * @return the flightNumber
     */
    public int getFlightNumber() {
        return flightNumber;
    }

    /**
     * @param flightNumber the flightNumber to set
     */
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * @param departureTime the departureTime to set
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the numberOfSeatsLeft
     */
    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    /**
     * @param numberOfSeatsLeft the numberOfSeatsLeft to set
     */
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    /**
     * @return the originalPrice
     */
    public double getOriginalPrice() {
        return originalPrice;
    }

    /**
     * @param originalPrice the originalPrice to set
     */
    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * @return the seatsBooked
     */
    public int getSeatsBooked() {
        return seatsBooked;
    }

    /**
     * @param seatsBooked the seatsBooked to set
     */
    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public boolean bookASeat() {
    if(numberOfSeatsLeft >0)
    { --numberOfSeatsLeft;
    seatsBooked++;
    return true;}
        else
        return false;
    }
    
    @Override
            public String toString(){
            return "Flight " + flightNumber +", " +origin +", " +destination +", " + departureTime +", original price:" + originalPrice  +"$ " ;
            
}
}
