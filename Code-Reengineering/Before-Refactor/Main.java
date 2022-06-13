import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner scan = new Scanner(System.in);
	private ArrayList<User> UserList = new ArrayList<User>();
	private ControlMenu CM = new ControlMenu();
	public ArrayList<Phone> PhoneList = new ArrayList<Phone>();

	void menu() {
		System.out.println("\nPhone Store");
		System.out.println("===========");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Exit");
	}

	public Main(boolean onApp) {
		PhoneList.add(new Iphone("Ibox", "Iphone", "Iphone 8 Plus", "A11 Bionic", "4 Gb", "32 Gb", 2017, 2000000, 3500, 7.5, "IP-245"));
		PhoneList.add(new Samsung("Samsung official store", "Samsung", "Samsung A52", "Octa Core", "8 Gb", "256 Gb", 2020, 4200000, 4500,8.0, "SA-765"));
		PhoneList.add(new Vivo("Ds cell", "Vivo", "Vivo T1 Pro", "Snapdragon 778G", "8 Gb", "128 Gb", 2021, 4300000, 5000,7.0, "VI-178"));
		PhoneList.add(new Xiaomi("Mi store", "Xiaomi", "Xiaomi note 8", "Snapdragon 665", "4 Gb", "64 Gb", 2019, 4000000, 3800,7.0, "XI-991"));
		PhoneList.add(new Oppo("Harapan celullar", "Oppo", "Oppo F1 s", "Snapdragon 616", "3 Gb", "32 Gb", 2018, 1300000, 2500,7.0, "OP-122"));

		while (onApp) {
		int input = 0;
			menu();
			do {
				System.out.println("Choose [1-3] >> ");
				try {
					input = scan.nextInt();
				} catch (Exception e) {
					scan.nextLine();
					System.out.println();
					System.out.println("Input must be number 1-3 !");
					continue;
				}
			} while (input > 3 || input < 1);
			switch (input) {
			case 1:
				CM.loginUser(UserList, PhoneList);
				break;
			case 2:
				CM.registerUser(UserList);
				break;
			case 3:
				System.out.println("Thanks for using phone store app");
				System.exit(0);
				break;
			default:
				Exit.UserExit();
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Main(true);
	}

	public ArrayList<Phone> getList() {
		return PhoneList;
	}
}
