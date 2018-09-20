public class Product {

	private String name;
	private double price, stock;

	public Product(String name, double price, double stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getStock() {
		return stock;
	}

}