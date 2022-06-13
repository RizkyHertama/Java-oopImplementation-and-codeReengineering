import java.util.ArrayList;
import java.util.Scanner;

public class ControlMenu {
	private Scanner scan = new Scanner(System.in);
	private Validation valid = new Validation();
	ArrayList<UserCheckout> checkout = new ArrayList<UserCheckout>();

	public void registerUser(ArrayList<User> list) {
		String Email, password, Name;
		do {
			System.out.println("Input your name  [0 to exit] : ");
			Name = scan.nextLine();
			if (Name.equals("0")) {
				Exit.UserExit();
			}
		} while (!valid.checkName(Name));
		do {
			System.out.println("Input your Email [0 to exit] : ");
			Email = scan.nextLine();
			if (Email.equals("0")) {
				Exit.UserExit();
			}
			Email = Email.trim();
		} while (!valid.checkEmail(Email, list));
		do {
			System.out.println("Input your Password (At least 6 character and must contains 1 Symbol) [0 to exit] : ");
			password = scan.nextLine();
			if (password.equals("0")) {
				Exit.UserExit();;
			}
		} while (!valid.checkPassword(password));
		list.add(new User(Name, Email, password));
	}

	public void loginUser(ArrayList<User> list, ArrayList<Phone> Phonelist) {
		String Email, password;
		int index = -1;
		do {
			System.out.println("Input your Email [0 to exit] : ");
			Email = scan.nextLine();
			if (Email.equals("0")) {
				Exit.UserExit();
			}
			System.out.println("Input your Password : ");
			password = scan.nextLine();
			index = valid.checkID(Email, password, list);
		} while (index == -1);
		new UserLogin(true, list.get(index), Phonelist, checkout);
	}
	
	/* CODE SMELL COUPLERS SMELL : INAPPROPRIATE INTIMACY*/
	public void printPhoneList(ArrayList<Phone> list) {
		int index = 1;
		System.out.println("\tAll Phone");
		System.out.println("==================================");
		for (Phone phone : list) {
			System.out.println("Phone ID    : " + index++);
			System.out.println("Phone shop  	      : " + phone.getA());
			phone.BrandId();
			System.out.println("Phone Brand 	      : " + phone.getB());
			System.out.println("Phone Type  	      : " + phone.getC());
			System.out.println("Processor   	      : " + phone.getD());
			System.out.println("RAM         	      : " + phone.getE());
			System.out.println("Storage     	      : " + phone.getF());
			System.out.println("Year        	      : " + phone.getG());
			System.out.println("Price        	      : " + phone.getH());
			System.out.println("Baterry     	      : " + phone.getI());
			System.out.println("Ratings     	      : " + phone.getj() + "/10");
			System.out.println("==================================");
		}

	}

	public void BuyPhone(ArrayList<Phone> list) {
		printPhoneList(list);
		int index;
		
		/* CODE SMELL DISPENSABLE SMELL : DEAD CODE*/
//		String input = "";
//		int index = -1;
//		do {
//			System.out.println(list.size());
//			System.out.println("Choose your Phone (Use Phone ID or Brand to Choose) : ");
//			input = scan.nextLine();
//			index = valid.checkPhone(list, input);
//		} while (index == -1);
//		user.AddPhoneList(list.get(index));
		
		System.out.println("Choose Your Phone (Use Phone ID / Type 0 To Exit) : ");
		index = scan.nextInt();
		if (index == 0) {}
		else
		{
			String Type;
			Type = list.get(index-1).getC();
			System.out.printf("%s ",Type);
			checkout.add(new UserCheckout(Type));
			
			System.out.println("Phone added to chart!");
			scan.nextLine();
		}
	}
	
	/* CODE SMELL BLOATERS : LONG PARAMETER LIST*/
	public void viewCheckout(String name, String username, String password) {
		if (checkout.isEmpty()) {
			System.out.println("Your Shopping chart is empty!");
			scan.nextLine();
			return;
		}
		System.out.println("Checkout");
		System.out.println("================");
		for (int i = 0; i < checkout.size(); i++) {
			System.out.printf("%d. %s\n",i+1,checkout.get(i).getType());
		}
		System.out.println("Press Enter When You Are Done...");
		scan.nextLine();
	}
	
	public void inputRatings(User user,ArrayList<Phone>list)
	{
		if (checkout.isEmpty()) 
		{
			System.out.println("You haven't buy anything yet!");
			scan.nextLine();
			return;
		}
		else
		{
			Double newRatings;
			double rate;
			int num = 1;
			System.out.println("You Bought :");
			for (UserCheckout phone : checkout) {
				System.out.println(num++ + ". " + phone.getType());
			}
			String PhoneToRate;
				System.out.print("Type The Phone Name To Rate : ");
				PhoneToRate = scan.nextLine();
				int index = -1;
				for (int i = 0; i < list.size(); i++) 
				{
					if (PhoneToRate.equalsIgnoreCase(list.get(i).getC())) 
					{
						index = i;
					}
				}
				if (index!=-1) 
				{
					System.out.println("Rate this phone from 1 - 10 scale : ");
					rate = scan.nextDouble();
					Double old = list.get(index).getj();
					newRatings = ((old + rate)/2);
					list.get(index).setj(newRatings);	
				}
				else
				{
					System.out.println("Invalid Name");
				}
		}
	}
	public void createShop(ArrayList<Phone> list)
	{
		String ShopName,PhoneBrand,PhoneType,PhoneProcessor,PhoneRam,PhoneStorage;
		Integer PhoneYear,PhonePrice,PhoneBattery;
		Double PhoneRatings;
		
		System.out.println("Name Of Your Shop : ");
		ShopName = scan.nextLine();
			System.out.println("Insert Phone's Brand [Iphone/Oppo/Xiaomi/Vivo/Samsung] : ");
			PhoneBrand = scan.nextLine();
			/* CODE SMELL DISPENSABLE SMELL : DUPLICATE CODE*/
			if (PhoneBrand.equalsIgnoreCase("Iphone")) 
			{
				System.out.println("Insert Phone's Type : ");
				PhoneType = scan.nextLine();
				System.out.println("Insert Phone's Processor : ");
				PhoneProcessor = scan.nextLine();
				System.out.println("Insert Phone's Ram : ");
				PhoneRam = scan.nextLine();
				System.out.println("Insert Phone's Storage : ");
				PhoneStorage = scan.nextLine();
				System.out.println("Insert Phone's Year : ");
				PhoneYear = scan.nextInt();
				System.out.println("Insert Phone's Price : ");
				PhonePrice = scan.nextInt();
				System.out.println("Insert Phone's Battery : ");
				PhoneBattery = scan.nextInt();
				System.out.println("Insert Phone's Rating : ");
				PhoneRatings = scan.nextDouble();
				String SE1 = "IP";
				int SE2 = (int) Math.round(Math.random()*9);
				int SE3 = (int) Math.round(Math.random()*9);
				int SE4 = (int) Math.round(Math.random()*9);
				String IphoneSeNum = SE1+"-"+SE2+SE3+SE4;
				list.add(new Iphone(ShopName,PhoneBrand,PhoneType,PhoneProcessor,PhoneRam,PhoneStorage,PhoneYear,PhonePrice,PhoneBattery,PhoneRatings, IphoneSeNum));	
			}
			/* CODE SMELL DISPENSABLE SMELL : DUPLICATE CODE*/
			else if(PhoneBrand.equalsIgnoreCase("Oppo"))
			{
				System.out.println("Insert Phone's Type : ");
				PhoneType = scan.nextLine();
				System.out.println("Insert Phone's Processor : ");
				PhoneProcessor = scan.nextLine();
				System.out.println("Insert Phone's Ram : ");
				PhoneRam = scan.nextLine();
				System.out.println("Insert Phone's Storage : ");
				PhoneStorage = scan.nextLine();
				System.out.println("Insert Phone's Year : ");
				PhoneYear = scan.nextInt();
				System.out.println("Insert Phone's Price : ");
				PhonePrice = scan.nextInt();
				System.out.println("Insert Phone's Battery : ");
				PhoneBattery = scan.nextInt();
				System.out.println("Insert Phone's Rating : ");
				PhoneRatings = scan.nextDouble();
				String SE1 = "OP";
				int SE2 = (int) Math.round(Math.random()*9);
				int SE3 = (int) Math.round(Math.random()*9);
				int SE4 = (int) Math.round(Math.random()*9);
				String OppoSeNum = SE1+"-"+SE2+SE3+SE4;
				list.add(new Oppo(ShopName,PhoneBrand,PhoneType,PhoneProcessor,PhoneRam,PhoneStorage,PhoneYear,PhonePrice,PhoneBattery,PhoneRatings, OppoSeNum));	
			}
			/* CODE SMELL DISPENSABLE SMELL : DUPLICATE CODE*/
			else if(PhoneBrand.equalsIgnoreCase("Xiaomi"))
			{
				System.out.println("Insert Phone's Type : ");
				PhoneType = scan.nextLine();
				System.out.println("Insert Phone's Processor : ");
				PhoneProcessor = scan.nextLine();
				System.out.print("Insert Phone's Ram : ");
				PhoneRam = scan.nextLine();
				System.out.println("Insert Phone's Storage : ");
				PhoneStorage = scan.nextLine();
				System.out.println("Insert Phone's Year : ");
				PhoneYear = scan.nextInt();
				System.out.println("Insert Phone's Price : ");
				PhonePrice = scan.nextInt();
				System.out.println("Insert Phone's Battery : ");
				PhoneBattery = scan.nextInt();
				System.out.println("Insert Phone's Rating : ");
				PhoneRatings = scan.nextDouble();
				String SE1 = "XI";
				int SE2 = (int) Math.round(Math.random()*9);
				int SE3 = (int) Math.round(Math.random()*9);
				int SE4 = (int) Math.round(Math.random()*9);
				String XiaomiSeNum = SE1+"-"+SE2+SE3+SE4;
				list.add(new Xiaomi(ShopName,PhoneBrand,PhoneType,PhoneProcessor,PhoneRam,PhoneStorage,PhoneYear,PhonePrice,PhoneBattery,PhoneRatings, XiaomiSeNum));	
			}
			/* CODE SMELL DISPENSABLE SMELL : DUPLICATE CODE*/
			else if(PhoneBrand.equalsIgnoreCase("Vivo"))
			{
				System.out.println("Insert Phone's Type : ");
				PhoneType = scan.nextLine();
				System.out.println("Insert Phone's Processor : ");
				PhoneProcessor = scan.nextLine();
				System.out.println("Insert Phone's Ram : ");
				PhoneRam = scan.nextLine();
				System.out.println("Insert Phone's Storage : ");
				PhoneStorage = scan.nextLine();
		    	System.out.println("Insert Phone's Year : ");
				PhoneYear = scan.nextInt();
				System.out.println("Insert Phone's Price : ");
				PhonePrice = scan.nextInt();
				System.out.println("Insert Phone's Battery : ");
				PhoneBattery = scan.nextInt();
				System.out.println("Insert Phone's Rating : ");
				PhoneRatings = scan.nextDouble();
				String SE1 = "XI";
				int SE2 = (int) Math.round(Math.random()*9);
				int SE3 = (int) Math.round(Math.random()*9);
				int SE4 = (int) Math.round(Math.random()*9);
				String VivoSeNum = SE1+"-"+SE2+SE3+SE4;
				list.add(new Vivo(ShopName,PhoneBrand,PhoneType,PhoneProcessor,PhoneRam,PhoneStorage,PhoneYear,PhonePrice,PhoneBattery,PhoneRatings, VivoSeNum));	
			}
			/* CODE SMELL DISPENSABLE SMELL : DUPLICATE CODE*/
			else if(PhoneBrand.equalsIgnoreCase("Samsung"))
			{
				System.out.println("Insert Phone's Type : ");
				PhoneType = scan.nextLine();
				System.out.println("Insert Phone's Processor : ");
				PhoneProcessor = scan.nextLine();
				System.out.println("Insert Phone's Ram : ");
				PhoneRam = scan.nextLine();
				System.out.println("Insert Phone's Storage : ");
				PhoneStorage = scan.nextLine();
				System.out.println("Insert Phone's Year : ");
				PhoneYear = scan.nextInt();
				System.out.println("Insert Phone's Price : ");
				PhonePrice = scan.nextInt();
				System.out.println("Insert Phone's Battery : ");
				PhoneBattery = scan.nextInt();
				System.out.println("Insert Phone's Rating : ");
				PhoneRatings = scan.nextDouble();
				String SE1 = "SA";
				int SE2 = (int) Math.round(Math.random()*9);
				int SE3 = (int) Math.round(Math.random()*9);
				int SE4 = (int) Math.round(Math.random()*9);
				String SamsungSeNum = SE1+"-"+SE2+SE3+SE4;
				list.add(new Samsung(ShopName,PhoneBrand,PhoneType,PhoneProcessor,PhoneRam,PhoneStorage,PhoneYear,PhonePrice,PhoneBattery,PhoneRatings, SamsungSeNum));	
			}
			else
			{
				System.out.println("Phone is not reconize in the database !");
				scan.nextLine();
			}
		System.out.println("Your store is created !");
	}
}
