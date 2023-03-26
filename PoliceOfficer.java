package chapter2;

/* BREDA MWELU
 * This program prints out the parking ticket
 */

public class PoliceOfficer {
		
	
		// Declare the variables
		private String name;
		private int badgeNumber;

		private ParkedCar car;
		private ParkingMeter meter;
		public ParkingTicket ticket;


	   public PoliceOfficer()
	   {
	      name = "";
	      badgeNumber = 0;
	      car = new ParkedCar();
	      meter = new ParkingMeter();
	      ticket = new ParkingTicket();
	   }
	   
	   // Constructor
	   public PoliceOfficer(String officerName, int officerBadge)

	   {
	      name = officerName;
	      badgeNumber = officerBadge;
	   }

	   public void set(String officerName, int officerBadge)
	   {
	      name = officerName;
	      badgeNumber = officerBadge;
	   }

	   public PoliceOfficer(PoliceOfficer object2)
	   {
	      name = object2.name;
	      badgeNumber = object2.badgeNumber;
	   }
	   
	   // Getters and setters for the variables
	   public String getOfficerName()
	   {
	      return name; 
	   }

	   public int getOfficerBadgeNumber()
	   {
	      return badgeNumber; 
	   }


	    public ParkedCar getParkedCar()
	   {
	      return new ParkedCar(car);
	   }

	   public ParkingMeter getParkingMeter()
	   {
	      return new ParkingMeter(meter);
	   }

	   public ParkingTicket getParkingTicket()
	   {
	      return new ParkingTicket(ticket);
	   }
	   
	   
	   // Patrol method 
	   public ParkingTicket ticket(ParkedCar car, ParkingMeter meter)
	   {

	      if(car.minutes > meter.minutesPurchased)
	         return new ParkingTicket(ticket);
	      else
	         return null;
	   }

	   public String toString()
	   {
	      String str = "\nOfficer name: " + name +
	                   "\nBadge number: " + badgeNumber;
	      return str;
	   }

	   public boolean equals(PoliceOfficer PoliceOfficer2)
	   {
	      boolean status;

	      if(name.equals(PoliceOfficer2.name) &&
	         badgeNumber == PoliceOfficer2.badgeNumber &&
	         ticket.equals(PoliceOfficer2.ticket))
	         status = true;
	      else
	         status = false;

	      return status;      
	   }
	}


	   
	 

