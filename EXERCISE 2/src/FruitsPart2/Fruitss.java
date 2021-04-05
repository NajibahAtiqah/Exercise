package FruitsPart2;

public class Fruitss {
	String type;
	String colour;
	String taste;
	double weight;
	double price;
	
	void printSpec(String n, String a, String j, double i, double p) {
		System.out.println("Type: " + n);
		System.out.println("Colour: " + a);
		System.out.println("Taste: " + j);
		System.out.println("Weight: " + i + " gram");
		System.out.println("Price/1kg: " + "RM" + p);
	}
	void CalPrice (double i, double p) {
		double t = i*p;
		System.out.println("Total Price: " + "RM"+ t);
}
	void StoreNutrients (String w, String x, String y) {
		System.out.println("It contains of: " + w + ", " + x + " and " + y );
	}
	void PreventRiskDisease (String r, String s, String t) {
		System.out.println("It is good for: " + r + ", " + s + " and " + t);
	}
}
