package chapter2;
/*This class collects the minutes purchased 
 * 
 */

public class ParkingMeter {

	 public int minutesPurchased;

	   //with no arguments 
	   public ParkingMeter()
	   {
	      minutesPurchased = 0; 
	   }

	   //constructor with arguments
	   public ParkingMeter(int purchase)
	   {
	      minutesPurchased = purchase;
	   }

	   //set method
	   public void set(int purchase)
	   {
	      minutesPurchased = purchase;
	   }

	   //return method
	   public int getMinutesPurchased()
	   {
	      return minutesPurchased; 
	   }

	   public ParkingMeter(ParkingMeter object2)
	   {
	      minutesPurchased = object2.minutesPurchased;  
	   }

	   public String toString()
	   {
	      String str = "\nMinutes purchased: " + minutesPurchased;

	      return str;   
	   }  

	   public boolean equals(ParkingMeter ParkingMeter2)
	   {
	      boolean status;

	      if(minutesPurchased == ParkingMeter2.minutesPurchased)
	         status = true;
	      else
	         status = false;

	      return status;      
	   }
	}


