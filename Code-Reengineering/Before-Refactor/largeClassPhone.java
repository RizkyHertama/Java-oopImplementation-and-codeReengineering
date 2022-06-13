// Class ini tidak digunakan, class ini hanya sebagai contoh untuk
// mendemonstrasikan smell yang dapat terjadi pada program ini

/* CODE SMELL BLOATERS SMELL: LARGE CLASS*/
public class largeClassPhone {
	
	private String iphoneShop;
	private String iphoneBrand;
	private String iphoneType;
	private String iphoneProcessor;
	private String iphoneRam;
	private String iphoneStorage;
	private int iphoneYear;
	private int iphonePrice;
	private int iphoneBattery;
	private double iphoneRatings;
	
	public String getIphoneShop() {
		return iphoneShop;
	}
	public void setIphoneShop(String iphoneShop) {
		this.iphoneShop = iphoneShop;
	}
	public String getIphoneBrand() {
		return iphoneBrand;
	}
	public void setIphoneBrand(String iphoneBrand) {
		this.iphoneBrand = iphoneBrand;
	}
	public String getIphoneType() {
		return iphoneType;
	}
	public void setIphoneType(String iphoneType) {
		this.iphoneType = iphoneType;
	}
	public String getIphoneProcessor() {
		return iphoneProcessor;
	}
	public void setIphoneProcessor(String iphoneProcessor) {
		this.iphoneProcessor = iphoneProcessor;
	}
	public String getIphoneRam() {
		return iphoneRam;
	}
	public void setIphoneRam(String iphoneRam) {
		this.iphoneRam = iphoneRam;
	}
	public String getIphoneStorage() {
		return iphoneStorage;
	}
	public void setIphoneStorage(String iphoneStorage) {
		this.iphoneStorage = iphoneStorage;
	}
	public int getIphoneYear() {
		return iphoneYear;
	}
	public void setIphoneYear(int iphoneYear) {
		this.iphoneYear = iphoneYear;
	}
	public int getIphonePrice() {
		return iphonePrice;
	}
	public void setIphonePrice(int iphonePrice) {
		this.iphonePrice = iphonePrice;
	}
	public int getIphoneBattery() {
		return iphoneBattery;
	}
	public void setIphoneBattery(int iphoneBattery) {
		this.iphoneBattery = iphoneBattery;
	}
	public double getIphoneRatings() {
		return iphoneRatings;
	}
	public void setIphoneRatings(double iphoneRatings) {
		this.iphoneRatings = iphoneRatings;
	}
	public largeClassPhone(String iphoneShop, String iphoneBrand, String iphoneType, String iphoneProcessor,
			String iphoneRam, String iphoneStorage, int iphoneYear, int iphonePrice, int iphoneBattery,
			double iphoneRatings) {
		super();
		this.iphoneShop = iphoneShop;
		this.iphoneBrand = iphoneBrand;
		this.iphoneType = iphoneType;
		this.iphoneProcessor = iphoneProcessor;
		this.iphoneRam = iphoneRam;
		this.iphoneStorage = iphoneStorage;
		this.iphoneYear = iphoneYear;
		this.iphonePrice = iphonePrice;
		this.iphoneBattery = iphoneBattery;
		this.iphoneRatings = iphoneRatings;
	}
	
	private String samsungShop;
	private String samsungBrand;
	private String samsungType;
	private String samsungProcessor;
	private String samsungRam;
	private String samsungStorage;
	private int samsungYear;
	private int samsungPrice;
	private int samsungBattery;
	private double samsungRatings;
	
	public String getSamsungShop() {
		return samsungShop;
	}
	public void setSamsungShop(String samsungShop) {
		this.samsungShop = samsungShop;
	}
	public String getSamsungBrand() {
		return samsungBrand;
	}
	public void setSamsungBrand(String samsungBrand) {
		this.samsungBrand = samsungBrand;
	}
	public String getSamsungType() {
		return samsungType;
	}
	public void setSamsungType(String samsungType) {
		this.samsungType = samsungType;
	}
	public String getSamsungProcessor() {
		return samsungProcessor;
	}
	public void setSamsungProcessor(String samsungProcessor) {
		this.samsungProcessor = samsungProcessor;
	}
	public String getSamsungRam() {
		return samsungRam;
	}
	public void setSamsungRam(String samsungRam) {
		this.samsungRam = samsungRam;
	}
	public String getSamsungStorage() {
		return samsungStorage;
	}
	public void setSamsungStorage(String samsungStorage) {
		this.samsungStorage = samsungStorage;
	}
	public int getSamsungYear() {
		return samsungYear;
	}
	public void setSamsungYear(int samsungYear) {
		this.samsungYear = samsungYear;
	}
	public int getSamsungPrice() {
		return samsungPrice;
	}
	public void setSamsungPrice(int samsungPrice) {
		this.samsungPrice = samsungPrice;
	}
	public int getSamsungBattery() {
		return samsungBattery;
	}
	public void setSamsungBattery(int samsungBattery) {
		this.samsungBattery = samsungBattery;
	}
	public double getSamsungRatings() {
		return samsungRatings;
	}
	public void setSamsungRatings(double samsungRatings) {
		this.samsungRatings = samsungRatings;
	}
	public largeClassPhone(String iphoneShop, String iphoneBrand, String iphoneType, String iphoneProcessor,
			String iphoneRam, String iphoneStorage, int iphoneYear, int iphonePrice, int iphoneBattery,
			double iphoneRatings, String samsungShop, String samsungBrand, String samsungType, String samsungProcessor,
			String samsungRam, String samsungStorage, int samsungYear, int samsungPrice, int samsungBattery,
			double samsungRatings) {
		super();
		this.iphoneShop = iphoneShop;
		this.iphoneBrand = iphoneBrand;
		this.iphoneType = iphoneType;
		this.iphoneProcessor = iphoneProcessor;
		this.iphoneRam = iphoneRam;
		this.iphoneStorage = iphoneStorage;
		this.iphoneYear = iphoneYear;
		this.iphonePrice = iphonePrice;
		this.iphoneBattery = iphoneBattery;
		this.iphoneRatings = iphoneRatings;
		this.samsungShop = samsungShop;
		this.samsungBrand = samsungBrand;
		this.samsungType = samsungType;
		this.samsungProcessor = samsungProcessor;
		this.samsungRam = samsungRam;
		this.samsungStorage = samsungStorage;
		this.samsungYear = samsungYear;
		this.samsungPrice = samsungPrice;
		this.samsungBattery = samsungBattery;
		this.samsungRatings = samsungRatings;
	}

	
	private String vivoShop;
	private String vivoBrand;
	private String vivoType;
	private String vivoProcessor;
	private String vivoRam;
	private String vivoStorage;
	private int vivoYear;
	private int vivoPrice;
	private int vivoBattery;
	private double vivoRatings;
	
	public String getVivoShop() {
		return vivoShop;
	}
	public void setVivoShop(String vivoShop) {
		this.vivoShop = vivoShop;
	}
	public String getVivoBrand() {
		return vivoBrand;
	}
	public void setVivoBrand(String vivoBrand) {
		this.vivoBrand = vivoBrand;
	}
	public String getVivoType() {
		return vivoType;
	}
	public void setVivoType(String vivoType) {
		this.vivoType = vivoType;
	}
	public String getVivoProcessor() {
		return vivoProcessor;
	}
	public void setVivoProcessor(String vivoProcessor) {
		this.vivoProcessor = vivoProcessor;
	}
	public String getVivoRam() {
		return vivoRam;
	}
	public void setVivoRam(String vivoRam) {
		this.vivoRam = vivoRam;
	}
	public String getVivoStorage() {
		return vivoStorage;
	}
	public void setVivoStorage(String vivoStorage) {
		this.vivoStorage = vivoStorage;
	}
	public int getVivoYear() {
		return vivoYear;
	}
	public void setVivoYear(int vivoYear) {
		this.vivoYear = vivoYear;
	}
	public int getVivoPrice() {
		return vivoPrice;
	}
	public void setVivoPrice(int vivoPrice) {
		this.vivoPrice = vivoPrice;
	}
	public int getVivoBattery() {
		return vivoBattery;
	}
	public void setVivoBattery(int vivoBattery) {
		this.vivoBattery = vivoBattery;
	}
	public double getVivoRatings() {
		return vivoRatings;
	}
	public void setVivoRatings(double vivoRatings) {
		this.vivoRatings = vivoRatings;
	}
	public largeClassPhone(String iphoneShop, String iphoneBrand, String iphoneType, String iphoneProcessor,
			String iphoneRam, String iphoneStorage, int iphoneYear, int iphonePrice, int iphoneBattery,
			double iphoneRatings, String samsungShop, String samsungBrand, String samsungType, String samsungProcessor,
			String samsungRam, String samsungStorage, int samsungYear, int samsungPrice, int samsungBattery,
			double samsungRatings, String vivoShop, String vivoBrand, String vivoType, String vivoProcessor,
			String vivoRam, String vivoStorage, int vivoYear, int vivoPrice, int vivoBattery, double vivoRatings) {
		super();
		this.iphoneShop = iphoneShop;
		this.iphoneBrand = iphoneBrand;
		this.iphoneType = iphoneType;
		this.iphoneProcessor = iphoneProcessor;
		this.iphoneRam = iphoneRam;
		this.iphoneStorage = iphoneStorage;
		this.iphoneYear = iphoneYear;
		this.iphonePrice = iphonePrice;
		this.iphoneBattery = iphoneBattery;
		this.iphoneRatings = iphoneRatings;
		this.samsungShop = samsungShop;
		this.samsungBrand = samsungBrand;
		this.samsungType = samsungType;
		this.samsungProcessor = samsungProcessor;
		this.samsungRam = samsungRam;
		this.samsungStorage = samsungStorage;
		this.samsungYear = samsungYear;
		this.samsungPrice = samsungPrice;
		this.samsungBattery = samsungBattery;
		this.samsungRatings = samsungRatings;
		this.vivoShop = vivoShop;
		this.vivoBrand = vivoBrand;
		this.vivoType = vivoType;
		this.vivoProcessor = vivoProcessor;
		this.vivoRam = vivoRam;
		this.vivoStorage = vivoStorage;
		this.vivoYear = vivoYear;
		this.vivoPrice = vivoPrice;
		this.vivoBattery = vivoBattery;
		this.vivoRatings = vivoRatings;
	}
	
	private String XiaomiShop;
	private String XiaomiBrand;
	private String XiaomiType;
	private String XiaomiProcessor;
	private String XiaomiRam;
	private String XiaomiStorage;
	private int XiaomiYear;
	private int XiaomiPrice;
	private int XiaomiBattery;
	private double XiaomiRatings;
	
	public String getXiaomiShop() {
		return XiaomiShop;
	}
	public void setXiaomiShop(String xiaomiShop) {
		XiaomiShop = xiaomiShop;
	}
	public String getXiaomiBrand() {
		return XiaomiBrand;
	}
	public void setXiaomiBrand(String xiaomiBrand) {
		XiaomiBrand = xiaomiBrand;
	}
	public String getXiaomiType() {
		return XiaomiType;
	}
	public void setXiaomiType(String xiaomiType) {
		XiaomiType = xiaomiType;
	}
	public String getXiaomiProcessor() {
		return XiaomiProcessor;
	}
	public void setXiaomiProcessor(String xiaomiProcessor) {
		XiaomiProcessor = xiaomiProcessor;
	}
	public String getXiaomiRam() {
		return XiaomiRam;
	}
	public void setXiaomiRam(String xiaomiRam) {
		XiaomiRam = xiaomiRam;
	}
	public String getXiaomiStorage() {
		return XiaomiStorage;
	}
	public void setXiaomiStorage(String xiaomiStorage) {
		XiaomiStorage = xiaomiStorage;
	}
	public int getXiaomiYear() {
		return XiaomiYear;
	}
	public void setXiaomiYear(int xiaomiYear) {
		XiaomiYear = xiaomiYear;
	}
	public int getXiaomiPrice() {
		return XiaomiPrice;
	}
	public void setXiaomiPrice(int xiaomiPrice) {
		XiaomiPrice = xiaomiPrice;
	}
	public int getXiaomiBattery() {
		return XiaomiBattery;
	}
	public void setXiaomiBattery(int xiaomiBattery) {
		XiaomiBattery = xiaomiBattery;
	}
	public double getXiaomiRatings() {
		return XiaomiRatings;
	}
	public void setXiaomiRatings(double xiaomiRatings) {
		XiaomiRatings = xiaomiRatings;
	}
	public largeClassPhone(String iphoneShop, String iphoneBrand, String iphoneType, String iphoneProcessor,
			String iphoneRam, String iphoneStorage, int iphoneYear, int iphonePrice, int iphoneBattery,
			double iphoneRatings, String samsungShop, String samsungBrand, String samsungType, String samsungProcessor,
			String samsungRam, String samsungStorage, int samsungYear, int samsungPrice, int samsungBattery,
			double samsungRatings, String vivoShop, String vivoBrand, String vivoType, String vivoProcessor,
			String vivoRam, String vivoStorage, int vivoYear, int vivoPrice, int vivoBattery, double vivoRatings,
			String xiaomiShop, String xiaomiBrand, String xiaomiType, String xiaomiProcessor, String xiaomiRam,
			String xiaomiStorage, int xiaomiYear, int xiaomiPrice, int xiaomiBattery, double xiaomiRatings) {
		super();
		this.iphoneShop = iphoneShop;
		this.iphoneBrand = iphoneBrand;
		this.iphoneType = iphoneType;
		this.iphoneProcessor = iphoneProcessor;
		this.iphoneRam = iphoneRam;
		this.iphoneStorage = iphoneStorage;
		this.iphoneYear = iphoneYear;
		this.iphonePrice = iphonePrice;
		this.iphoneBattery = iphoneBattery;
		this.iphoneRatings = iphoneRatings;
		this.samsungShop = samsungShop;
		this.samsungBrand = samsungBrand;
		this.samsungType = samsungType;
		this.samsungProcessor = samsungProcessor;
		this.samsungRam = samsungRam;
		this.samsungStorage = samsungStorage;
		this.samsungYear = samsungYear;
		this.samsungPrice = samsungPrice;
		this.samsungBattery = samsungBattery;
		this.samsungRatings = samsungRatings;
		this.vivoShop = vivoShop;
		this.vivoBrand = vivoBrand;
		this.vivoType = vivoType;
		this.vivoProcessor = vivoProcessor;
		this.vivoRam = vivoRam;
		this.vivoStorage = vivoStorage;
		this.vivoYear = vivoYear;
		this.vivoPrice = vivoPrice;
		this.vivoBattery = vivoBattery;
		this.vivoRatings = vivoRatings;
		XiaomiShop = xiaomiShop;
		XiaomiBrand = xiaomiBrand;
		XiaomiType = xiaomiType;
		XiaomiProcessor = xiaomiProcessor;
		XiaomiRam = xiaomiRam;
		XiaomiStorage = xiaomiStorage;
		XiaomiYear = xiaomiYear;
		XiaomiPrice = xiaomiPrice;
		XiaomiBattery = xiaomiBattery;
		XiaomiRatings = xiaomiRatings;
	}
	
	private String oppoShop;
	private String oppoBrand;
	private String oppoType;
	private String oppoProcessor;
	private String oppoRam;
	private String oppoStorage;
	private int oppoYear;
	private int oppoPrice;
	private int oppoBattery;
	private double oppoRatings;
	
	public String getOppoShop() {
		return oppoShop;
	}
	public void setOppoShop(String oppoShop) {
		this.oppoShop = oppoShop;
	}
	public String getOppoBrand() {
		return oppoBrand;
	}
	public void setOppoBrand(String oppoBrand) {
		this.oppoBrand = oppoBrand;
	}
	public String getOppoType() {
		return oppoType;
	}
	public void setOppoType(String oppoType) {
		this.oppoType = oppoType;
	}
	public String getOppoProcessor() {
		return oppoProcessor;
	}
	public void setOppoProcessor(String oppoProcessor) {
		this.oppoProcessor = oppoProcessor;
	}
	public String getOppoRam() {
		return oppoRam;
	}
	public void setOppoRam(String oppoRam) {
		this.oppoRam = oppoRam;
	}
	public String getOppoStorage() {
		return oppoStorage;
	}
	public void setOppoStorage(String oppoStorage) {
		this.oppoStorage = oppoStorage;
	}
	public int getOppoYear() {
		return oppoYear;
	}
	public void setOppoYear(int oppoYear) {
		this.oppoYear = oppoYear;
	}
	public int getOppoPrice() {
		return oppoPrice;
	}
	public void setOppoPrice(int oppoPrice) {
		this.oppoPrice = oppoPrice;
	}
	public int getOppoBattery() {
		return oppoBattery;
	}
	public void setOppoBattery(int oppoBattery) {
		this.oppoBattery = oppoBattery;
	}
	public double getOppoRatings() {
		return oppoRatings;
	}
	public void setOppoRatings(double oppoRatings) {
		this.oppoRatings = oppoRatings;
	}
	public largeClassPhone(String iphoneShop, String iphoneBrand, String iphoneType, String iphoneProcessor,
			String iphoneRam, String iphoneStorage, int iphoneYear, int iphonePrice, int iphoneBattery,
			double iphoneRatings, String samsungShop, String samsungBrand, String samsungType, String samsungProcessor,
			String samsungRam, String samsungStorage, int samsungYear, int samsungPrice, int samsungBattery,
			double samsungRatings, String vivoShop, String vivoBrand, String vivoType, String vivoProcessor,
			String vivoRam, String vivoStorage, int vivoYear, int vivoPrice, int vivoBattery, double vivoRatings,
			String xiaomiShop, String xiaomiBrand, String xiaomiType, String xiaomiProcessor, String xiaomiRam,
			String xiaomiStorage, int xiaomiYear, int xiaomiPrice, int xiaomiBattery, double xiaomiRatings,
			String oppoShop, String oppoBrand, String oppoType, String oppoProcessor, String oppoRam,
			String oppoStorage, int oppoYear, int oppoPrice, int oppoBattery, double oppoRatings) {
		super();
		this.iphoneShop = iphoneShop;
		this.iphoneBrand = iphoneBrand;
		this.iphoneType = iphoneType;
		this.iphoneProcessor = iphoneProcessor;
		this.iphoneRam = iphoneRam;
		this.iphoneStorage = iphoneStorage;
		this.iphoneYear = iphoneYear;
		this.iphonePrice = iphonePrice;
		this.iphoneBattery = iphoneBattery;
		this.iphoneRatings = iphoneRatings;
		this.samsungShop = samsungShop;
		this.samsungBrand = samsungBrand;
		this.samsungType = samsungType;
		this.samsungProcessor = samsungProcessor;
		this.samsungRam = samsungRam;
		this.samsungStorage = samsungStorage;
		this.samsungYear = samsungYear;
		this.samsungPrice = samsungPrice;
		this.samsungBattery = samsungBattery;
		this.samsungRatings = samsungRatings;
		this.vivoShop = vivoShop;
		this.vivoBrand = vivoBrand;
		this.vivoType = vivoType;
		this.vivoProcessor = vivoProcessor;
		this.vivoRam = vivoRam;
		this.vivoStorage = vivoStorage;
		this.vivoYear = vivoYear;
		this.vivoPrice = vivoPrice;
		this.vivoBattery = vivoBattery;
		this.vivoRatings = vivoRatings;
		XiaomiShop = xiaomiShop;
		XiaomiBrand = xiaomiBrand;
		XiaomiType = xiaomiType;
		XiaomiProcessor = xiaomiProcessor;
		XiaomiRam = xiaomiRam;
		XiaomiStorage = xiaomiStorage;
		XiaomiYear = xiaomiYear;
		XiaomiPrice = xiaomiPrice;
		XiaomiBattery = xiaomiBattery;
		XiaomiRatings = xiaomiRatings;
		this.oppoShop = oppoShop;
		this.oppoBrand = oppoBrand;
		this.oppoType = oppoType;
		this.oppoProcessor = oppoProcessor;
		this.oppoRam = oppoRam;
		this.oppoStorage = oppoStorage;
		this.oppoYear = oppoYear;
		this.oppoPrice = oppoPrice;
		this.oppoBattery = oppoBattery;
		this.oppoRatings = oppoRatings;
	}
}
