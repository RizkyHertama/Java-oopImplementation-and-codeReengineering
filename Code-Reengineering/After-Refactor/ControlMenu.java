import java.util.ArrayList;
import java.util.Scanner;

public class ControlMenu {
	private static Scanner scan = new Scanner(System.in);
	private Validation valid = new Validation();
	ArrayList<UserCheckout> checkout = new ArrayList<UserCheckout>();
	
	void UserExit() {
		System.out.println("Thanks for using phone store app");
		System.exit(0);
	}
	
	
	public void registerUser(ArrayList<User> list) {
		String Email, password, Name;
		do {
			System.out.println("Input your name  [0 to exit] : ");
			Name = scan.nextLine();
			if (Name.equals("0")) {
				UserExit();
			}
		} while (!valid.checkName(Name));
		do {
			System.out.println("Input your Email [0 to exit] : ");
			Email = scan.nextLine();
			if (Email.equals("0")) {
				UserExit();
			}
			Email = Email.trim();
		} while (!valid.checkEmail(Email, list));
		do {
			System.out.println("Input your Password (At least 6 character and must contains 1 Symbol) [0 to exit] : ");
			password = scan.nextLine();
			if (password.equals("0")) {
				UserExit();
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
				UserExit();
			}
			System.out.println("Input your Password : ");
			password = scan.nextLine();
			index = valid.checkID(Email, password, list);
		} while (index == -1);
		new UserLogin(true, list.get(index), Phonelist, checkout);
	}
	
	
	
	public void printPhoneList(ArrayList<Phone> list) {
		int index = 1;
		System.out.println("\tAll Phone");
		System.out.println("==================================");
		for (Phone phone : list) {
			System.out.println("Phone ID    	      : " + index++);
			phone.PhoneForSale(list);
		}

	}

	public void BuyPhone(ArrayList<Phone> list) {
		printPhoneList(list);

		int index;
		System.out.println("Choose Your Phone (Use Phone ID / Type 0 To Exit) : ");
		index = scan.nextInt();
		if (index == 0) {}
		else
		{
			String Type;
			Type = list.get(index-1).getType();
			System.out.printf("%s ",Type);
			checkout.add(new UserCheckout(Type));
			
			System.out.println("Phone added to chart!");
			scan.nextLine();
		}
	}
	
	public void viewCheckout(User user) {
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
					if (PhoneToRate.equalsIgnoreCase(list.get(i).getType())) 
					{
						index = i;
					}
				}
				if (index!=-1) 
				{
					System.out.println("Rate this phone from 1 - 10 scale : ");
					rate = scan.nextDouble();
					Double old = list.get(index).getRatings();
					newRatings = ((old + rate)/2);
					list.get(index).setRatings(newRatings);	
				}
				else
				{
					System.out.println("Invalid Name");
				}
		}
	}
	
	public static void createShop(ArrayList<Phone> list){
		String ShopName,PhoneBrand,PhoneType,PhoneProcessor,PhoneRam,PhoneStorage;
		Integer PhoneYear,PhonePrice,PhoneBattery;
		Double PhoneRatings;
		
		System.out.println("Name Of Your Shop : ");
		ShopName = scan.nextLine();
		
		do {
			System.out.println("Insert Phone's Brand [Iphone/Oppo/Xiaomi/Vivo/Samsung] : ");
			PhoneBrand = scan.nextLine();
			
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
			
			if (PhoneBrand.equalsIgnoreCase("Iphone")) {
				String SE1 = "IP";
				int SE2 = (int) Math.round(Math.random()*9);
				int SE3 = (int) Math.round(Math.random()*9);
				int SE4 = (int) Math.round(Math.random()*9);
				String IphoneSeNum = SE1+"-"+SE2+SE3+SE4;
				list.add(new Iphone(ShopName,PhoneBrand,PhoneType,PhoneProcessor,PhoneRam,PhoneStorage,PhoneYear,PhonePrice,PhoneBattery,PhoneRatings, IphoneSeNum));
			}
			
			else if(PhoneBrand.equalsIgnoreCase("Oppo")) {
				String SE1 = "OP";
				int SE2 = (int) Math.round(Math.random()*9);
				int SE3 = (int) Math.round(Math.random()*9);
				int SE4 = (int) Math.round(Math.random()*9);
				String OppoSeNum = SE1+"-"+SE2+SE3+SE4;
				list.add(new Oppo(ShopName,PhoneBrand,PhoneType,PhoneProcessor,PhoneRam,PhoneStorage,PhoneYear,PhonePrice,PhoneBattery,PhoneRatings, OppoSeNum));
			}
			
			else if(PhoneBrand.equalsIgnoreCase("Xiaomi")) {
				String SE1 = "XI";
				int SE2 = (int) Math.round(Math.random()*9);
				int SE3 = (int) Math.round(Math.random()*9);
				int SE4 = (int) Math.round(Math.random()*9);
				String XiaomiSeNum = SE1+"-"+SE2+SE3+SE4;
				list.add(new Xiaomi(ShopName,PhoneBrand,PhoneType,PhoneProcessor,PhoneRam,PhoneStorage,PhoneYear,PhonePrice,PhoneBattery,PhoneRatings, XiaomiSeNum));
			}
			
			else if(PhoneBrand.equalsIgnoreCase("Samsung")) {
				String SE1 = "SA";
				int SE2 = (int) Math.round(Math.random()*9);
				int SE3 = (int) Math.round(Math.random()*9);
				int SE4 = (int) Math.round(Math.random()*9);
				String SamsungSeNum = SE1+"-"+SE2+SE3+SE4;
				list.add(new Samsung(ShopName,PhoneBrand,PhoneType,PhoneProcessor,PhoneRam,PhoneStorage,PhoneYear,PhonePrice,PhoneBattery,PhoneRatings, SamsungSeNum));
			}
			else if(PhoneBrand.equalsIgnoreCase("Vivo")) {
				String SE1 = "VI";
				int SE2 = (int) Math.round(Math.random()*9);
				int SE3 = (int) Math.round(Math.random()*9);
				int SE4 = (int) Math.round(Math.random()*9);
				String VivoSeNum = SE1+"-"+SE2+SE3+SE4;
				list.add(new Vivo(ShopName,PhoneBrand,PhoneType,PhoneProcessor,PhoneRam,PhoneStorage,PhoneYear,PhonePrice,PhoneBattery,PhoneRatings, VivoSeNum));
			}
			else{
				System.out.println("Phone is not reconize in the database !");
				scan.nextLine();
			}
			
		}while(PhoneBrand.equalsIgnoreCase("Iphone") && PhoneBrand.equalsIgnoreCase("Oppo") && PhoneBrand.equalsIgnoreCase("Xiaomi") && PhoneBrand.equalsIgnoreCase("Vivo") && PhoneBrand.equalsIgnoreCase("Samsung"));
			
		System.out.println("Your store is created !");
	}	
	
}
