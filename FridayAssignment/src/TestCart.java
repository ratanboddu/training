public class TestCart {

	public static void main(String[] args) {

		Product p1 = new Product("Samsung", 25000, 5);
		Product p2 = new Product("LG", 22000, 10);
		Product p3 = new Product("Hitachi", 30000, 5);
		Product p4 = new Product("Asus", 18000, 5);

		Cart cart1 = new Cart();

		cart1.addProduct(p1, 8);
		cart1.addProduct(p2, 4);
		cart1.addProduct(p3, 1);
		cart1.addProduct(p4, 3);
		cart1.showCart();

		cart1.removeProduct("LG");
		cart1.removeProduct("Asus");
		cart1.showCart();
		
		cart1.addProduct(p4, 3);
		cart1.showCart();
	}

}