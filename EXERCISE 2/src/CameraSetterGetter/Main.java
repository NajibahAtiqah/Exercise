package CameraSetterGetter;

public class Main {

	public static void main(String[] args) {
		Camera Dslr = new Camera();
		
		Dslr.setType("DSLR");
		Dslr.setPixel(26);
		Dslr.setBrand("CANON");
		Dslr.setColour("BLACK");
		Dslr.setWeight(771.8);
		Dslr.setPrice(5280.00);
		
		System.out.println("++++ CAMERA PROPERTIES ++++");
		System.out.println("Type: " + Dslr.getType());
		System.out.println("EffectivePixels: " + Dslr.getPixel() + " MP");
		System.out.println("Brand: " + Dslr.getBrand());
		System.out.println("Colour: " + Dslr.getColour());
		System.out.println("Weight: " + Dslr.getWeight() + " gram");
		System.out.println("Price: " + "RM " + Dslr.getPrice() + " each");
		
		System.out.println("------------------------------------");
		Dslr.CalPrice(5280.00, 2);
		System.out.println("------------------------------------");
		Dslr.CalBalance(1500.00, 5280.00);
		System.out.println("------------------------------------");
		Dslr.CalPaymentEachMonth(5280.00, 24);
		System.out.println("------------------------------------");
		Dslr.ClaimWarranty(2019);
	}

}
