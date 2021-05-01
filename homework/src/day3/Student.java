package day3;

public class Student extends User {
	
	private int id;
	private String mobil;
	private String school;

	public Student() {

	}

	public Student(int id, String name,String mobil,String school) {
		super();
		this.id = id;
		this.setName(name);
		this.mobil = mobil;
		this.school = school;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobil() {
		return mobil;
	}

	public void setMobil(String mobil) {
		this.mobil = mobil;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}


}
