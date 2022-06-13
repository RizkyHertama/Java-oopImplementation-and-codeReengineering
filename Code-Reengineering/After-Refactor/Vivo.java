
public class Vivo extends Phone {

	String VivoSerialNumber;
	
	
	
	public Vivo(String shop, String brand, String type, String processor, String ram, String storage, int year,
			int price, int battery, Double ratings, String vivoSerialNumber) {
		super(shop, brand, type, processor, ram, storage, year, price, battery, ratings);
		VivoSerialNumber = vivoSerialNumber;
	}

	public String getVivoSerialNumber() {
		return VivoSerialNumber;
	}



	public void setVivoSerialNumber(String vivoSerialNumber) {
		VivoSerialNumber = vivoSerialNumber;
	}


	@Override
	void BrandId() {
		System.out.println("Vivo Serial Number    : " + this.getVivoSerialNumber());
	}
}
