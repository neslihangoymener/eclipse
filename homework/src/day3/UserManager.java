package day3;

public class UserManager {
	
	
	public void list(User[] users) {
		for(User user : users) {
			System.out.println( user.getName());
		}
		System.out.println(" kullan�c�lar listelendi");
	}
	
	public void add(User user) {
		System.out.println(user.getName() + " eklendi");
	}
	
	public void update(User user) {
		System.out.println(user.getName() + " g�ncellendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getName() + " silindi");
	}

}
