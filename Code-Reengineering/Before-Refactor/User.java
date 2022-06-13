import java.util.ArrayList;

public class User {
	String name, username, password;
	ArrayList<Phone> UserPhoneList;
	
	public User(String name, String username, String password) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		UserPhoneList = new ArrayList<Phone>();
	}
	
//	public int AddPhoneList(Phone PhoneList) {
//		boolean flag = true;
//		if (UserPhoneList.size() >= 3) {
//			return -2;
//		}
//		if (UserPhoneList.isEmpty()) {
//			this.UserPhoneList.add(PhoneList);
//			return 1;
//		} else {
//			for (Phone phone : UserPhoneList) {
//				if (phone.getBrand().equals(PhoneList.getBrand())) {
//					return -1;
//				}
//			}
//			if (flag) {
//				this.UserPhoneList.add(PhoneList);
//				return 1;
//			}
//		}
//		return -1;
//	}
	
	public ArrayList<Phone> getUserPhoneList() {
		return UserPhoneList;
	}

	public void setPhoneList(ArrayList<Phone> PhoneList) {
		UserPhoneList = PhoneList;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
