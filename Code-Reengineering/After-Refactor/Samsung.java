
public class Samsung extends Phone {

	String SamsungSerialNumber;
	
	
	
	public Samsung(String shop, String brand, String type, String processor, String ram, String storage, int year,
			int price, int battery, Double ratings, String samsungSerialNumber) {
		super(shop, brand, type, processor, ram, storage, year, price, battery, ratings);
		SamsungSerialNumber = samsungSerialNumber;
	}

	

	
	public String getSamsungSerialNumber() {
		return SamsungSerialNumber;
	}




	public void setSamsungSerialNumber(String samsungSerialNumber) {
		SamsungSerialNumber = samsungSerialNumber;
	}




	@Override
	void BrandId() {
		System.out.println("Samsung Serial Number : " + this.getSamsungSerialNumber());	
		
	}



}
