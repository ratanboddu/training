
public class Cart {
	private Product[] products;
	private int[] quantity;
	private int indx, idx, counter, total;

	public Cart() {
		products = new Product[5];
		quantity = new int[5];
		counter = 0;
		total = 0;
		idx = 0;
	}

	public void addProduct(Product prod, int quantities) {
		products[indx] = prod;
		quantity[indx] = quantities;
		indx++;
	}

	public void showCart() {
		System.out.println("Product Name " + "\t" + "Product Price" + "\t" + "Product Total");
		counter = 0;
		total = 0;
		for (Product product : products) {
			if (product != null) {
				if ((quantity[counter] < product.getStock()) && (product.getName() != null)) {
					total += quantity[counter] * product.getPrice();
					System.out.println(product.getName() + "\t\t" + product.getPrice() + "\t\t"
							+ quantity[counter] * product.getPrice());
				} else if (quantity[counter] > product.getStock())
					System.out.println("Out of Stock");
				counter++;
			}

		}
		System.out.println("Total is " + total);
	}

	public void removeProduct(String removedItem) {
		idx = 0;
		for (Product product : products) {
			idx++;
			if (removedItem.equals(product.getName())) {
				products[idx - 1].setName(null);
				quantity[idx - 1] = 0;
				break;
			}
		}
	}

}
