package FruitScanner;

import java.util.*;

public class Fruit {
	Scanner s = new Scanner(System.in);
	
	void printFruitCharacteristic() {
		//Input string
		System.out.println();
		System.out.println("Enter Type of fruit, Colour, Taste, Weight and Price: ");
		String x = s.nextLine();
		String y = s.nextLine();
		String z = s.nextLine();
		
		//Input Numerical
		double w = s.nextDouble();
		double p = s.nextDouble();
		
		System.out.println("Type of fruit is: " + x);
		System.out.println("Colour of fruit is: " + y);
		System.out.println("Taste of fruit is: " + z);
		System.out.println("Weight of fruit is: " + w + " gram");
		System.out.println("Price of fruit/KG: " + "RM " +  p);
		
	}
	
	void calPrice() {
		System.out.println();
		System.out.println("Enter price and quantity: ");
		double p = s.nextDouble();
		double q = s.nextDouble();
		
		double t = p*q;
		
		System.out.println("Total price: "+ "RM" + t);
		
}
	void calDensity() {
		System.out.println();
		System.out.println("Enter mass and volume: ");
		double m = s.nextDouble();
		double v = s.nextDouble();
		
		double d = m/v;
		
		System.out.println("The desnsity of the fruit is: " + d + " g/cm^3");
	}
	void calCalories() {
		System.out.println();
		System.out.println("Enter carbs, protein and fat: ");
		double c = s.nextDouble();
		double n = s.nextDouble();
		double f = s.nextDouble();
		
		double g = (c+n+f)*4;
		
		System.out.println("The calories of fruit is: " + g);
	}
	void calEnergyValue() {
		System.out.println();
		System.out.println("Enter mass of water, change in temperature, mass of fruit: ");//xrise in temp/mass of fruit
		int a = s.nextInt();//mass of H2o
		int e = s.nextInt();//change in temperature
		double h = s.nextDouble();//mass of fruit sample
		
		double i = (a*4.2*e)/h;
		
		System.out.println("The energy value of fruit sample is: " + i + " J/g");
	}
}
