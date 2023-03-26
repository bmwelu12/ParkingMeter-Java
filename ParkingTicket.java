package chapter2;

/* BREDA MWELU
 *  Lab Assignment 2
 *  last modified: 11/4/2022
 *  
 *  This program determines the amount of fine paid and has the getters and setters for the ParkedCar,PoliceOfficer and ParkingMeter classes.
 */

public class ParkingTicket {
	
	// Declare variables
	private ParkedCar car;
	private PoliceOfficer officer;
	private ParkingMeter meter;
	private double baseFine = 25.0;
	private double hourlyFine = 10.0;

	
	// Constructor
	
	public ParkingTicket()
	   {  
	     
	   } 

	   public ParkingTicket(ParkedCar c, PoliceOfficer o,
	                        ParkingMeter m)
	   {
	      car = new ParkedCar(c);
	      officer = new PoliceOfficer(o);
	      meter = new ParkingMeter(m);  
	   }  

	   // Copy constructor
	   public ParkingTicket(ParkingTicket object2)
	   {
	      car = object2.car;
	      officer = object2.officer;
	      meter = object2.meter;

	   }                   
	   
	   // Getters and Setters  for the classes
	   public ParkedCar getParkedCar()
	   {
	      return new ParkedCar(car);
	   }

	   public PoliceOfficer getPoliceOfficer()
	   {
	      return new PoliceOfficer(officer);
	   }

	   public ParkingMeter getParkingMeter()
	   {
	      return new ParkingMeter(meter);
	   }

	   
	   // Calculate the fine
	   public double getFine()
	   {
	      double ticket;

	      if (car.minutes <= meter.minutesPurchased)
	      {
	         ticket = 0;
	      }
	      else
	         ticket = baseFine + (hourlyFine * ((car.minutes - meter.minutesPurchased) / 60)); 

	      return ticket;    

	   }

	   // To string method
	   public String toString()
	   {
	      String str = "\nVehicle information:\n" +
	                  car +
	                  "\n\nOfficer information:\n" +
	                  officer + 
	                  "\nFine: $" + getFine();
	      return str;
	   }

	   // Comparing
	   public boolean equals(ParkingTicket ParkingTicket2)
	   {
	      boolean status;

	      if(car.equals(ParkingTicket2.car) &&
	         officer.equals(ParkingTicket2.officer) &&
	         meter.equals(ParkingTicket2.meter) &&
	         getFine() == ParkingTicket2.getFine())

	         status = true;
	      else
	         status = false;

	      return status;      
	   }
}

	