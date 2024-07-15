/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mbkr
 */
public class Manager {
   
    private ArrayList<Flight> flights= new ArrayList<Flight>();
        private ArrayList<Ticket> tickets= new ArrayList<Ticket>();
        
        
public void createFlights(){
                        System.out.println("Creating a Flight!");

    Scanner s = new Scanner(System.in);
                    System.out.println("Scan or Defualt? answer with s or d");
                    String t = s.nextLine();
if (t.equals("s")||t.equals("S")){

                System.out.println("Entere the Flight's Number");
int fn= s.nextInt();
s.nextLine();

  System.out.println("Entere the flight's Origin");
String o = s.nextLine();
     System.out.println("Entere the flight's Destination");
String d = s.nextLine();
System.out.println("Entere the flight's Departure Time");
String ddt = s.nextLine();
  System.out.println("Entere the Flight's Capacity");
int c= s.nextInt();
s.nextLine();
 System.out.println("Entere the Flight's price");
double p= s.nextDouble();
s.nextLine();

        Flight f = new Flight(fn, o,d, ddt, c ,p);
        flights.add(f);
}
else if (t.equals("d") || t.equals("D")){
Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 12, 2500);
flights.add(f);
}
else 
   System.out.println("Error: Invalid output! Enter s or d");
}



    public void displayAvailableFlights(String origin, String destination){
    for(Flight f: flights)
    {
        if(origin.equals(f.getOrigin()) && destination.equals(f.getDestination()) && f.getNumberOfSeatsLeft()>0)
        {    
        System.out.println(""+f);}
        else         System.out.println("No FLights Avilable for this Locations");
    }
    
    }
    public Flight getFlight(int flightNumber){
        Flight x = null;
        for(Flight f: flights)
    { if(flightNumber== f.getFlightNumber())
x = f;
 
    }
        return x;
    }
    public void bookSeat(int flightNumber, Passenger p)
    { Flight f = getFlight(flightNumber);
    if (f == null)
    {System.out.println("Error: this flight does not exist!");}
    else{
   boolean  booked=  f.bookASeat();
   if(!booked)
   {System.out.println("Error: No seats avilable on this flight");}
   else {
   double price = p.applyDiscount(f.getOriginalPrice());
   Ticket t= new Ticket(p,f,price);
   tickets.add(t);
   System.out.println("Ticket is Issued!");
      System.out.println(" "+t);
   }}}

public static void main(String[] args ){ try{
    Manager cAL = new Manager();
cAL.createFlights();
Scanner s = new Scanner(System.in);
                    System.out.println("Search for a flight: Enter the Orgin of the flight");
                    String o = s.nextLine();
                    System.out.println("Search for a flight: Enter the Destination of the flight");
                    String d = s.nextLine();
cAL.displayAvailableFlights(o,d);
String k = "y";
while (!k.equals("n")){
                            System.out.println("Booking a Flight: Enter Flight Number");
                    int num = s.nextInt();
s.nextLine();

 System.out.println("Costumer Data: Member? Enter y or n");
                    String m = s.nextLine();
                    Passenger p;
                    switch (m){
  case "Y":
 case "y":
                            System.out.println("Costumer Data: Costumet Name?");
                    String n = s.nextLine();
                    System.out.println("Costumer Data: Costumet age?");
                    int a = s.nextInt();
                    s.nextLine();

                     System.out.println("Costumer Data: Years of Membership?");
                    int y = s.nextInt();
                    s.nextLine();

                            p = new Member(n,a,y);
                        break;
             case "N":
                        case "n": 
                              System.out.println("Costumer Data: Costumet Name?");
                    String n1 = s.nextLine();
                    System.out.println("Costumer Data: Costumet age?");
                    int a1 = s.nextInt();
                    s.nextLine();
                            p = new NonMember(n1,a1);
                        break;
                      default:  p = new NonMember("Mohamed",20);
                    }
cAL.bookSeat(num,p); System.out.println("Book another flight? Enter 'n' if you are done! or anything else if you wish to Contnue booking");
                    k = s.nextLine();}
} catch(Exception e ){                              System.out.println("Error: Invalid input try again!");System.out.println("");
}


}
}