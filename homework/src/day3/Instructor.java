package day3;

public class Instructor extends User {
	
	private int id;
	private String education;
	private String course;

	public Instructor() {

	}

	public Instructor(int id,String name, String education,String course) {
		super();
		this.id = id;
		this.setName(name);
		this.education = education;
		this.course = course;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
