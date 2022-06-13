
public class Xiaomi extends Phone {

String XiaomiSerialNumber;


	public Xiaomi(String shop, String brand, String type, String processor, String ram, String storage, int year, int price,
		int battery, Double ratings, String xiaomiSerialNumber) {
		super(shop, brand, type, processor, ram, storage, year, price, battery, ratings);
		XiaomiSerialNumber = xiaomiSerialNumber;
	}
	
	


	public String getXiaomiSerialNumber() {
		return XiaomiSerialNumber;
	}




	public void setXiaomiSerialNumber(String xiaomiSerialNumber) {
		XiaomiSerialNumber = xiaomiSerialNumber;
	}


	@Override
	void BrandId() {
		System.out.println("Xiaomi Serial Number  : " + this.getXiaomiSerialNumber());
		
	}




	
}
