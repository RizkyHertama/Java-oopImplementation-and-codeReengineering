/* CODE SMELL DISPENSABLE SMELL : COMMENTS */
public abstract class Phone {
	/*CODE SMELL ENCAPSULATION SMELL */
	public String a; //  variabel untuk shop
	public String b; // variabel untuk brand
	public String c; // variabel untuk type
	public String d; // variabel untuk processor
	public String e; // variabel untuk ram
	public String f; // variabel untuk storage
	public int g; // variabel untuk year
	public int h; // variabel untuk price
	public int i; // variabel untuk battery
	public double j; // variabel untuk ratings
	
	

	public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}


	public String getB() {
		return b;
	}


	public void setB(String b) {
		this.b = b;
	}


	public String getC() {
		return c;
	}


	public void setC(String c) {
		this.c = c;
	}


	public String getD() {
		return d;
	}


	public void setD(String d) {
		this.d = d;
	}


	public String getE() {
		return e;
	}


	public void setE(String e) {
		this.e = e;
	}


	public String getF() {
		return f;
	}


	public void setF(String f) {
		this.f = f;
	}


	public int getG() {
		return g;
	}


	public void setG(int g) {
		this.g = g;
	}


	public int getH() {
		return h;
	}


	public void setH(int h) {
		this.h = h;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public double getj() {
		return j;
	}


	public void setj(double j) {
		this.j = j;
	}
	
	abstract void BrandId();

}

