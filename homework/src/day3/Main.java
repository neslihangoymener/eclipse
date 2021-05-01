package day3;

public class Main {

	public static void main(String[] args) {
		User user1=new User(1,"Engin Demiro�",1983,"engindemirog.io","12345");
		User user2=new User(2,"Neslihan G�ymener",1979,"neslihangoymener.io","12345");
		User user3=new User(3,"Nuray G�ymener",2005,"nuraygoymener.io","12345");
		User user4=new User(4,"Emir G�ymener",2009,"emirgoymener.io","12345");
		
		Student student1=new Student(1,"Neslihan G�ymener","5555555555","YT�");
		Student student2=new Student(2,"Nuray G�ymener","5555555555","��");
		Student student3=new Student(3,"Emir G�ymener","5555555555","�T�");
		
		Instructor instructor1=new Instructor(1,"Engin Demiro�","Programlama","java");
		Instructor instructor2=new Instructor(2,"Engin Demiro�","Programlama","C++");
		Instructor instructor3=new Instructor(3,"Engin Demiro�","Programlama","Temel");
		
		UserManager userManager=new UserManager();
        userManager.add(user1);
        userManager.add(user2);
        userManager.add(user3);
        userManager.add(user4);
        System.out.println("Kullan�c�lar eklendi");
        System.out.println("*******************************");

        StudentManager studentManager=new StudentManager() ;
        
        studentManager.add(student1);    
        studentManager.add(student2);  
        studentManager.add(student3);  
        System.out.println("��renciler eklendi");
        System.out.println("*******************************");

        
        Student[] students = {student1,student2,student3};
        studentManager.schoolList(students);
        
        InstructorManager instructorManager=new InstructorManager();
        instructorManager.add(instructor1);
        instructorManager.add(instructor2);
        instructorManager.add(instructor3);
        System.out.println("E�itmen kurslar� eklendi");
        System.out.println("*******************************");

        
        Instructor[] instructors = {instructor1,instructor2,instructor3};
        instructorManager.courseList(instructors);
	}

}
