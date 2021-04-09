package FruitScanner;

public class Main {

	public static void main(String[] args) {
		
		Fruit Apple = new Fruit();
		Fruit Banana = new Fruit();
		Fruit Grape = new Fruit();
		Fruit Strawberry = new Fruit();
		
		System.out.println("++ APPLE INFORMATION ++");
		Apple.printFruitCharacteristic();
		Apple.calPrice();
		Apple.calDensity();
		Apple.calCalories();
		Apple.calEnergyValue();
		
		System.out.println("___________________________________________");
		System.out.println("++ BANANA INFORMATION ++");
		Banana.printFruitCharacteristic();
		Banana.calPrice();
		Banana.calDensity();
		Banana.calCalories();
		Banana.calEnergyValue();
		
		System.out.println("___________________________________________");
		System.out.println("++ GRAPE INFORMATION ++");
		Grape.printFruitCharacteristic();
		Grape.calPrice();
		Grape.calDensity();
		Grape.calCalories();
		Grape.calEnergyValue();
		
		System.out.println("___________________________________________");
		System.out.println("++ BANANA INFORMATION ++");
		Strawberry.printFruitCharacteristic();
		Strawberry.calPrice();
		Strawberry.calDensity();
		Strawberry.calCalories();
		Strawberry.calEnergyValue();
	}

}
