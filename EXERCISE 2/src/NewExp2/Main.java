package NewExp2;

public class Main {

	public static void main(String[] args) {
		Fruits Apple = new Fruits();
		String type =" ";
		Apple.Colour = "red/green";
		Apple.Taste = "sweet/sour";
		System.out.println("The fruit is an apple.");
		System.out.println("The colour of an apple is " + Apple.Colour);
		System.out.println("It tastes " + Apple.Taste);
		Apple.storenutrients();
		Apple.preventriskdisease();
		
		Fruits Banana = new Fruits();
		String type2 =" ";
		Banana.Colour = "yellow";
		Banana.Taste = "sweet";
		System.out.println("The fruit is banana.");
		System.out.println("The colour of a banana is " + Banana.Colour);
		System.out.println("The taste of banana is " + Banana.Taste);
		Banana.storenutrient2();
		Banana.preventriskdisease2();
		
		

	}

}
