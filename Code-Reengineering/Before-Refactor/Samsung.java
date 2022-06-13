
public class Samsung extends Phone {

	String k;  //untuk serial number
	
	public Samsung(String a, String b, String c, String d, String e, String f, int g, int h, int i, double j, String k) {
		/*CODE SMELL OBJECT ORIENTED DESIGN SMELL : PULL UP CONSTRUCTOR BODY */
		this.a = a; //  variabel untuk shop
		this.b = b; // variabel untuk brand
		this.c = c; // variabel untuk type
		this.d = d; // variabel untuk processor
		this.e = e; // variabel untuk ram
		this.f = f; // variabel untuk storage
		this.g = g; // variabel untuk year
		this.h = h;	// variabel untuk price	
		this.i = i;	// variabel untuk battery
		this.j = j;	// variabel untuk ratings
		this.k = k;
	}


	public Samsung() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getK() {
		return k;
	}



	public void setK(String k) {
		this.k = k;
	}



	@Override
	void BrandId() {
		System.out.println("Iphone Serial Number  : " + this.getK());
		
	}

}
