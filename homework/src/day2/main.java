package day2;

public class main {

	public static void main(String[] args) {


		Category category1=new Category(1,"Programlama");
		
		Teacher teacher1=new Teacher(1,"12345678910","Engin Demiro�",1983,"5555555555");
		
		Product product1 = new Product(1,1,1,"C#","Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)",0);
		Product product2 = new Product(1,1,1,"JAVA","Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)",0);
		Product product3 = new Product(1,1,1,"Temel","Programlamaya Giri� i�in Temel Kurs",0);

		Category[]  categories = {category1};
		
		for (Category category : categories) {
			System.out.println(category.name);
		}
		
		Teacher[] teachers = {teacher1};
		
		for (Teacher teacher : teachers) {
			System.out.println(teacher.name);
		}
		
		
		Product[] products = {product1,product2,product3};
		
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		
		ProductManager productManager = new ProductManager();
		productManager.add(product1);
		productManager.add(product2);
		productManager.add(product3);
		
	}

}
