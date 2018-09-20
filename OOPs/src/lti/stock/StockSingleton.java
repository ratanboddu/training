package lti.stock;

public final class StockSingleton {
	public StockSingleton() {
	}

	private static Stock stock;

	public static Stock getStock() {

		if (stock == null)
			stock = new Stock();

		return stock;
	}
}
