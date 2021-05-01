package day3;

public class User {
	private int id;
	private String name;
	private int yearOfBirth;
	private String eMail;
	private String password;

	public User() {

	}

	public User(int id, String name, int yearOfBirth, String eMail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.eMail = eMail;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
