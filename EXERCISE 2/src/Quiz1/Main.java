package Quiz1;

public class Main {

	public static void main(String[] args) {
		Cat Parsy = new Cat();
		
		Parsy.setWeight(71.8);
		Parsy.setPrice(500.00);
		
		System.out.println("++ CAT INFORMATION ++");
		Parsy.printCatCharacteristics();
		
		System.out.println("Weight: " + Parsy.getWeight() + " gram");
		System.out.println("Price: " + "RM " + Parsy.getPrice() + " each");
		
	}

}
