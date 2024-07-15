/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package coe528.lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mbkr
 */
public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
     @Test
public void testConstructor()
{boolean x = true;
try {
Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);
}catch(Exception e){
x = false;
}
assertTrue(x);
}
    
          @Test
public void testInvalidConstructor()
{boolean x = true;
try {
Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", -12, -2500);
}catch(Exception e){
x = false;
}
assertFalse(x);
try {
Flight f2 = new Flight(123, "Egypt", "Egypt","1/1/2001", -12, -2500);
}catch(Exception e){
x = false;
}
assertFalse(x);

}
    
    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);
        int expResult = 123;
        int result = f.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);

        int flightNumber = 0;
        f.setFlightNumber(flightNumber);
         int expResult = 0;
        int result = f.getFlightNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
         Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);
    String expResult = "Alexandria";
        String result = f.getOrigin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    //    fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
       System.out.println("setOrgin");
        Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);

        String flightNumber = "Egypt";
        f.setOrigin(flightNumber);
         String expResult = "Egypt" ;
        String result = f.getOrigin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);
    String expResult = "Egypt";
        String result = f.getDestination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);

        String s = "Alexandria";
        f.setDestination(s);
         String expResult = "Alexandria" ;
        String result = f.getDestination();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
         Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);
    String expResult = "1/1/2001";
        String result = f.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
              Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);

        String s = "Alexandria";
        f.setDepartureTime(s);
         String expResult = "Alexandria" ;
        String result = f.getDepartureTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
          Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);
    int expResult = 103;
        int result = f.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
                  Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);

        f.setCapacity(500);
         int expResult = 500;
        int result = f.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsLeft");
        Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);
    int expResult = 103;
        int result = f.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
        f.bookASeat();
         expResult = 102;
         result = f.getNumberOfSeatsLeft();
                assertEquals(expResult, result);

    }

    /**
     * Test of setNumberOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
       Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);

        f.setNumberOfSeatsLeft(500);
         int expResult = 500;
        int result = f.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
          Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);
   boolean x = 0 == Math.abs(2500 -f.getOriginalPrice());
       assertTrue(x);
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
                  Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);

               f.setOriginalPrice(500);
     boolean x = 0 == Math.abs(500 -f.getOriginalPrice());
       assertTrue(x);
    }

    /**
     * Test of getSeatsBooked method, of class Flight.
     */
    @Test
    public void testGetSeatsBooked() {
        System.out.println("getSeatsBooked");
         Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);
       boolean x=  f.bookASeat();
    int expResult = 1;
        int result = f.getSeatsBooked();
        assertEquals(expResult, result);
        assertTrue(x);
    }

    /**
     * Test of setSeatsBooked method, of class Flight.
     */
    @Test
    public void testSetSeatsBooked() {
        System.out.println("setSeatsBooked");
                 Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);
        int seatsBooked = 60;
        f.setSeatsBooked(seatsBooked);
        int expResult = 60;
        int result = f.getSeatsBooked();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
       Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);
       boolean x=  f.bookASeat();
    int expResult = 1;
        int result = f.getSeatsBooked();
        assertEquals(expResult, result);
        assertTrue(x);
                assertEquals(f.getNumberOfSeatsLeft(), 102);

    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
       Flight f = new Flight(123, "Alexandria", "Egypt","1/1/2001", 103, 2500);
        String expResult = "Flight 123, Alexandria, Egypt, 1/1/2001, original price:2500.0$ " ;
        String result = f.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
