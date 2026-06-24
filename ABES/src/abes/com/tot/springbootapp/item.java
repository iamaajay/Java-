package abes.com.tot.springbootapp;

class CartItem {
	public int product;
	private int quantity;

	public CartItem(int product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public int getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return quantity;
	}
}
