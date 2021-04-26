package day2;

public class Product {

	public Product() {

	}

	public Product(int id,int categoryId,int teacherId, String name, String detail, double unitPrice) {
		this();
		this.id = id;
		this.categoryId=categoryId;
		this.teacherId=teacherId;
		this.name = name;
		this.detail = detail;
		this.unitPrice = unitPrice;

	}

	int id;
	int categoryId;
	int teacherId;
	String name;
	String detail;
	double unitPrice;

}
