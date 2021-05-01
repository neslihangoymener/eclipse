package day3;

public class StudentManager extends UserManager {

	public void schoolList(Student[] students) {
		System.out.println("*******************************");
		System.out.println("Öğrencilerin Okul Listesi");
		System.out.println("*******************************");
		for (Student student : students) {
			System.out.println(student.getName() + " : " + student.getSchool());
		}
		System.out.println("*******************************");
	}

}
