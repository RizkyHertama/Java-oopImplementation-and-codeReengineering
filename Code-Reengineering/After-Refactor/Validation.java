import java.util.ArrayList;

public class Validation {
	boolean checkEmail(String Email, ArrayList<User> list) {
		if (Email.charAt(0)!='@' && Email.contains("@") && Email.endsWith(".com")) {
			for (User x : list) {
				if (x.getUsername().equals(Email)) {
					System.out.println("Email Already Exists! \n");
					return false;
				}
			}
			return true;
		}
		System.out.println("Email must contains '@' and ends with '.com' \n");
		return false;
	}

	boolean checkName(String Name) {
		if (Name.length() > 2) {
			return true;
		} else if (Name.equals(" ")) {
			System.out.println("Name can't be empty");
			return false;
		}
		System.out.println("Name can't less than 3 characters! \n");
		return false;
	}

	boolean checkPassword(String Pass) {
		if (Pass.length() >= 6) {
			boolean flag = false;
			String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
			for (int i = 0; i < Pass.length(); i++) {
				if (character.contains(Character.toString(Pass.charAt(i)))) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("Password must have at least one aphabet! \n");
				return false;
			}
			String symbol = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
			for (int i = 0; i < symbol.length(); i++) {
				char ch = symbol.charAt(i);
				if (Pass.contains(Character.toString(ch))) {
					return true;
				}
			}
			System.out.println("Password must contains at least one unique symbol! \n");
			return false;
		}
		System.out.println("Password must contains at least 6 characters! \n");
		return false;
	}

	int checkID(String ID, String Pass, ArrayList<User> list) {
		int i = 0;
		for (User x : list) {
			if (x.getUsername().equals(ID)) {
				if (x.getPassword().equals(Pass)) {
					return i;
				} else {
					System.out.println("Email or Password wrong! \n");
					return -1;
				}
			}
			i++;
		}
		System.out.println("Email not found! \n");
		return -1;
	}

	public int checkPhone(ArrayList<Phone> list, String input) {
		// TODO Auto-generated method stub
		return 0;
	}
}
