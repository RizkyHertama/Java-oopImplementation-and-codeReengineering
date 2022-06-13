
public class Iphone extends Phone{
	
	String IphoneSerialNumber;

	public Iphone(String shop, String brand, String type, String processor, String ram, String storage, int year,
			int price, int battery, Double ratings, String iphoneSerialNumber) {
		super(shop, brand, type, processor, ram, storage, year, price, battery, ratings);
		IphoneSerialNumber = iphoneSerialNumber;
	}

	public String getIphoneSerialNumber() {
		return IphoneSerialNumber;
	}

	public void setIphoneSerialNumber(String iphoneSerialNumber) {
		IphoneSerialNumber = iphoneSerialNumber;
	}


	@Override
	void BrandId() {
		System.out.println("Iphone Serial Number  : " + this.getIphoneSerialNumber());	

	}

}

