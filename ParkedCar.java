package chapter2;
/* Breda Mwelu
 * This program gets the car details as well as the minutes  parked
 */

public class ParkedCar {

	private String make;
	   private String model;
	   private String color;
	   private String licenseNumber;
	   public int minutes;

	   //Constructor with no arguments
	   public ParkedCar()
	   {
	      make = "";
	      model = "";
	      color = "";
	      licenseNumber = "";
	      minutes = 0;
	   }

	   //constructor with arguments
	   public ParkedCar(String cMake, String cModel,
	                    String cColor, String cLicenseNum, int cMinutes)
	   {
	      make = cMake;
	      model = cModel;
	      color = cColor;
	      licenseNumber = cLicenseNum;
	      minutes = cMinutes;
	   }

	   //The set method sets a value for each field 
	   public void set(String carMake, String carModel,
	                   String carColor, String carLicenseNum,
	                   int carMinutes)
	   {
	      make = carMake;
	      model = carModel;
	      color = carColor;
	      licenseNumber = carLicenseNum;
	      minutes = carMinutes;
	   }

	   //copy constructor initializes
	   //the object as a copy of another
	   //instructor object. 
	   public ParkedCar(ParkedCar object2)
	   {
	      make = object2.make;
	      model = object2.model;
	      color = object2.color;
	      licenseNumber = object2.licenseNumber;
	      minutes = object2.minutes;
	   }

	   // Getters and setters 
	   
	   public String getMake()
	   {
	      return make;
	   }

	   public String getModel()
	   {
	      return model;
	   }

	   public String getColor()
	   {
	      return color;
	   }

	   public String getLicenseNumber()
	   {
	      return licenseNumber;
	   }

	   public int getMinutes()
	   {
	      return minutes; 
	   }

	   //converts everything into a string  
	   public String toString()
	   {
	      String str = "\nMake: " + make +
	                   "\nModel: " + model + 
	                   "\nColor: " + color +
	                   "\nLicense number: " + licenseNumber +
	                   "\nMinutes parked: " + minutes;
	      return str;
	   }

	   //comparing
	   public boolean equals(ParkedCar ParkedCar2)
	   {
	      boolean status;

	      if(make.equals(ParkedCar2.make) &&
	         model.equals(ParkedCar2.model) &&
	         color.equals(ParkedCar2.color) &&
	         licenseNumber.equals(ParkedCar2.licenseNumber))

	         status = true;
	      else
	         status = false;

	      return status;      
	   }
	}


