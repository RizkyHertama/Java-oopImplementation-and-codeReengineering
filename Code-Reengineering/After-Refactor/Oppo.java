
public class Oppo extends Phone {

	String OppoSerialNum;

	public Oppo(String shop, String brand, String type, String processor, String ram, String storage, int year,
			int price, int battery, Double ratings, String oppoSerialNum) {
		super(shop, brand, type, processor, ram, storage, year, price, battery, ratings);
		OppoSerialNum = oppoSerialNum;
	}

	public String getOppoSerialNum() {
		return OppoSerialNum;
	}


	public void setOppoSerialNum(String oppoSerialNum) {
		OppoSerialNum = oppoSerialNum;
	}


	@Override
	void BrandId() {
		System.out.println("Oppo Serial Number    : " + this.getOppoSerialNum());	
	}

}
