package day3;

public class InstructorManager extends UserManager {
	public void courseList(Instructor[] instructors) {
		System.out.println("*******************************");
		System.out.println("Eðitmenlerin Kurs Listesi");
		System.out.println("*******************************");
		for (Instructor instructor : instructors) {
			System.out.println(instructor.getName() + " : " + instructor.getCourse());
		}
		System.out.println("*******************************");
	}

}
