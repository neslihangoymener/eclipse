package day3;

public class Main {

	public static void main(String[] args) {
		User user1=new User(1,"Engin Demiroğ",1983,"engindemirog.io","12345");
		User user2=new User(2,"Neslihan Göymener",1979,"neslihangoymener.io","12345");
		User user3=new User(3,"Nuray Göymener",2005,"nuraygoymener.io","12345");
		User user4=new User(4,"Emir Göymener",2009,"emirgoymener.io","12345");
		
		Student student1=new Student(1,"Neslihan Göymener","5555555555","YTÜ");
		Student student2=new Student(2,"Nuray Göymener","5555555555","İÜ");
		Student student3=new Student(3,"Emir Göymener","5555555555","İTÜ");
		
		Instructor instructor1=new Instructor(1,"Engin Demiroğ","Programlama","java");
		Instructor instructor2=new Instructor(2,"Engin Demiroğ","Programlama","C++");
		Instructor instructor3=new Instructor(3,"Engin Demiroğ","Programlama","Temel");
		
		UserManager userManager=new UserManager();
        userManager.add(user1);
        userManager.add(user2);
        userManager.add(user3);
        userManager.add(user4);
        System.out.println("Kullanıcılar eklendi");
        System.out.println("*******************************");

        StudentManager studentManager=new StudentManager() ;
        
        studentManager.add(student1);    
        studentManager.add(student2);  
        studentManager.add(student3);  
        System.out.println("Öğrenciler eklendi");
        System.out.println("*******************************");

        
        Student[] students = {student1,student2,student3};
        studentManager.schoolList(students);
        
        InstructorManager instructorManager=new InstructorManager();
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);
        instructorManager.add(instructor3);
        System.out.println("Eğitmen kursları eklendi");
        System.out.println("*******************************");

        
        Instructor[] instructors = {instructor1,instructor2,instructor3};
        instructorManager.courseList(instructors);
	}

}
