package day3;

public class UserManager {
	
	
	public void list(User[] users) {
		for(User user : users) {
			System.out.println( user.getName());
		}
		System.out.println(" kullanýcýlar listelendi");
	}
	
	public void add(User user) {
		System.out.println(user.getName() + " eklendi");
	}
	
	public void update(User user) {
		System.out.println(user.getName() + " güncellendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getName() + " silindi");
	}

}
