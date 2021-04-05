package FruitsPart2;

public class Main {

	public static void main(String[] args) {
		Fruitss Apple = new Fruitss();
		Fruitss Banana = new Fruitss();
		Fruitss Grape = new Fruitss();
		Fruitss Strawberry = new Fruitss();
		
		System.out.println("-APPLE CHARACTERISTICS-");
		Apple.printSpec("Pome","Red/Green", "Sweet/Sour", 102.0, 6.00);
		Apple.CalPrice(2.5, 6.00);
		Apple.StoreNutrients("Fibre", "VitaB", "VitaK");
		Apple.PreventRiskDisease("Cancer", "Diabetes", "Asthma");
		System.out.println("________________________________");
		
		System.out.println("-BANANA CHARACTERISTICS-");
		Banana.printSpec("Exotic/Tropical","Yellow", "Sweet", 118.0, 8.60);
		Banana.CalPrice(1.0, 8.60);
		Banana.StoreNutrients("Fibre", "Potassium", "Magnesium");
		Banana.PreventRiskDisease("Insulin Sensitivity", "Digestive Health", "Heart Health");
		System.out.println("________________________________");
		
		System.out.println("-GRAPE CHARACTERISTICS-");
		Grape.printSpec("Citrus","Purple/Green", "Sour", 262.0, 7.50 );
		Grape.CalPrice(0.5, 7.50);
		Grape.StoreNutrients("Iron", "VitaA", "VitaK");
		Grape.PreventRiskDisease("Heart Disease", "Cancer", "Diabetes");
		System.out.println("________________________________");
		
		System.out.println("-STRAWBERRY CHARACTERISTICS-");
		Strawberry.printSpec("Berries","Red", "Sweet with a bit of acid", 12.0, 28.00);
		Strawberry.CalPrice(5.0,28.00);
		Strawberry.StoreNutrients("Calcium", "Magnesium", "VitaC");
		Strawberry.PreventRiskDisease("Blood Pressure", "Stroke", "Cardiovascular Disease");
		System.out.println("________________________________");
	}
	
	}

