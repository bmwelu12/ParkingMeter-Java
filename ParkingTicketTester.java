package chapter2;

/*  Breda Mwelu
 * 
 * This program demonstrates the police officer class,parking ticket,parking meter and parked car class.
 * This program prints out a parking ticket and determines the fine issued
 * 
 */


public class ParkingTicketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParkedCar myCar = new ParkedCar("Ford", "Mustang","Red", "LMJCD",80);
	      ParkingMeter myMeter = new ParkingMeter(60);
	      PoliceOfficer myOfficer = new PoliceOfficer("Dane", 5565);
	      ParkingTicket myTicket = new ParkingTicket(myCar,myOfficer, myMeter);
	      
	      
	      // Displays the parking ticket details
	      System.out.println(myMeter);
	      System.out.println(myTicket);
	   }
	
		
	}


