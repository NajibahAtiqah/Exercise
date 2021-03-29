package Example2;

public class Fruits {

	public static void main(String[] args) {
		Apple a = new Apple();//create new object name as a
		a.printFruits();
		a.printColour();
		a.printMass();
		a.printTaste();
		a.printStoreNutrients();
		a.printPreventDisease();
		
		System.out.println("______________________");
	
		Banana b = new Banana();
		b.printFruits();
		b.printColours();
		b.printMass();
		b.printTaste();
		b.printStoreNutrients();
		b.printPreventDisease();
	}

}
