package objectTask;

import java.util.Objects;

public class Product {
	private String name;
	private String mou;
	private int price;
	private int stock;
	private int id;
	
	public Product() {;}
	public Product(String name, String mou, int price, int stock, int id) {
		super();
		this.name = name;
		this.mou = mou;
		this.price = price;
		this.stock = stock;
		this.id = id;
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
	public String getMou() {
		return mou;
	}
	public void setMou(String mou) {
		this.mou = mou;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", mou=" + mou + ", price=" + price + ", stock=" + stock + ", id=" + id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, mou, name, price, stock);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id;
	}
	
}
