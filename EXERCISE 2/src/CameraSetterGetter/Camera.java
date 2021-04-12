package CameraSetterGetter;

public class Camera {

	String type;
	String brand;
	String colour;
	int pixel;
	double weight;
	double price;
	
	//Create setter method
	public void setType(String type) {
	    this.type = type;
	  }
	
	  public void setColour(String colour) {
		    this.colour = colour;
	  }
	  
	  public void setBrand(String brand) {
	    this.brand = brand;
	  }
	  
	  public void setPixel(int pixel) {
		    this.pixel = pixel;
	  }
	  
	  public void setWeight(double weight) {
		  this.weight = weight;
	  }
	  
	  public void setPrice(double price) {
		  this.price = price;
	  }

	  // Create Getter Method
	  public String getType() {
		  return this.type;
	  }
	  
	  public String getBrand() {
		  return this.brand;
	  }
	  
	  public String getColour() {
		  return this.colour;
	  }
	  
	  public int getPixel() {
	 	  return this.pixel;
	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	  
	  public double getPrice() {
		  return this.price;
	  }
	  
	  
		public void CalPrice(double p, int q) {
			double t = p*q;
			System.out.println("Total price: "+ "RM" + t);
	  }
		
		public void CalBalance(double d, double t) {
			double b = t-d;
			System.out.println("Your deposit is: " + "RM " + d);
			System.out.println("The balance needs to pay is: " + "RM " + b);
		}
		
		public void CalPaymentEachMonth(double p, int e) {
			double d = ((p*0.3)+p)/e;
			System.out.println("If you want to pay it monthly, we charged 30% from the price.");
			System.out.println("You need to pay " + "RM " + d + " per months.");
	}
		
		public void ClaimWarranty(int y) {
			int totalYear= 2021-y;
			System.out.println("You had used your camera for: " + totalYear + " years.");
			if(totalYear<3) {
				System.out.println("You can claim your warranty as it's still valid.");
			}else if(totalYear>3) {
				System.out.println("I am sorry. You can't claim the warranty.");			
	        }
}
	}
	
