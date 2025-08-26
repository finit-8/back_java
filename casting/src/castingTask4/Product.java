package castingTask4;

import java.util.Scanner;

public class Product extends Market{
	//- 필드: 이름, 가격, 재고
	
	int price;
	int stock;
	
	public Product() {;}
	public Product(String name, int price, int stock) {
		super(name);
		this.price = price;
		this.stock = stock;
	}
	
}
