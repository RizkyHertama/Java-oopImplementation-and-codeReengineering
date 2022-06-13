import java.util.ArrayList;

public abstract class Phone {

	 private String shop;
	 private String brand;
	 private String type;
	 private String processor;
	 private String ram;
	 private String storage;
	 private int year;
	 private int price;
	 private int battery;
	 private Double ratings;
	
	public Phone(String shop, String brand, String type, String processor, String ram, String storage, int year,
		int price, int battery,Double ratings) {
		super();
		this.shop = shop;
		this.brand = brand;
		this.type = type;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
		this.year = year;
		this.price = price;
		this.battery = battery;
		this.ratings = ratings;
	}



	public String getShop() {
		return shop;
	}



	public void setShop(String shop) {
		this.shop = shop;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getProcessor() {
		return processor;
	}



	public void setProcessor(String processor) {
		this.processor = processor;
	}



	public String getRam() {
		return ram;
	}



	public void setRam(String ram) {
		this.ram = ram;
	}



	public String getStorage() {
		return storage;
	}



	public void setStorage(String storage) {
		this.storage = storage;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getBattery() {
		return battery;
	}



	public void setBattery(int battery) {
		this.battery = battery;
	}



	public Double getRatings() {
		
		
		return ratings;
	}



	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}

	
	public void PhoneForSale(ArrayList<Phone> list) {
		
		System.out.println("Phone shop  	      : " + getShop());
		BrandId();
		System.out.println("Phone Brand 	      : " + getBrand());
		System.out.println("Phone Type  	      : " + getType());
		System.out.println("Processor   	      : " + getProcessor());
		System.out.println("RAM         	      : " + getRam());
		System.out.println("Storage     	      : " + getStorage());
		System.out.println("Year        	      : " + getYear());
		System.out.println("Price        	      : " + getPrice());
		System.out.println("Baterry     	      : " + getBattery());
		System.out.println("Ratings     	      : " + getRatings() + "/10");
		System.out.println("==================================");

}
	abstract void BrandId();









	
	
}
