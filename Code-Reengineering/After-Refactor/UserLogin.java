

import java.util.*;
import java.time.*;

public class UserLogin {
	Scanner scan = new Scanner(System.in);
	LocalDate LocalTime = LocalDate.now();
	private ControlMenu CM = new ControlMenu();
	
	void menu(User user) {
		System.out.println("\nHello, " + user.getName());
		System.out.println("Logined at : " + LocalTime);
		System.out.println("=======================");
		System.out.println("Chose your menu ");
		System.out.println("1. Browse & Buy Phone");
		System.out.println("2. View Checkout");
		System.out.println("3. Input Ratings");
		System.out.println("4. Create Shop & Sell");
		System.out.println("5. Log out !");
	}


	public UserLogin(boolean OnApp, User user, ArrayList<Phone> list,ArrayList<UserCheckout> checkout) {
		while (OnApp) {
			int input = -1;
			menu(user);
			do {
				System.out.println("Choose one >> ");
				try {
					input = scan.nextInt();
				} catch (Exception e) {
					scan.nextLine();
					System.out.println("Input must be number 1-3 !");
				}
			} while (input > 5 || input < 1);
			switch (input) {
			case 1:
				CM.BuyPhone(list);
				break;
			case 2:
				CM.viewCheckout(user);
				break;
			case 3:
				CM.inputRatings(user,list);
				break;
			case 4:
				CM.createShop(list);
				break;
			case 5:
				OnApp = !OnApp;
				return;
			default:
			}
		}
	}

	public static void main(String[] args) {
		new Main (true);

	}

}
