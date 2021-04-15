package Quiz1;

import java.util.*;

public class Cat {
	
	double price;
	double weight;

	
	Scanner s = new Scanner(System.in);
	
	void printCatCharacteristics() {
		//Input string
		System.out.println();
		System.out.println("Enter Breed of cat, Colour, Size and Weight: ");
		String b = s.nextLine();
		String c = s.nextLine();
		String d  = s.nextLine();
		
		//Input Numerical
		double e = s.nextDouble();
		double f = s.nextDouble();
				
		System.out.println("Breed of cat is: " + b);
		System.out.println("Colour of cat is: " + c);
		System.out.println("Size of cat is: " + d);
		
	}
		
		//Create setter method
	public void setWeight(double weight) {
		  this.weight = weight;
	  }
	  
	  public void setPrice(double price) {
		  this.price = price;
	  }
		    
		// Create Getter Method
	  public double getWeight() {
		  return this.weight;
	  }
	  
	  public double getPrice() {
		  return this.price;
	  }
				


}
