package abes.com.tot.springbootapp;

import java.util.ArrayList;
import java.util.List;

public class Main {

	static class Product {
		String id;
		String name;
		double price;

		Product(String id, String name, double price) {
			this.id = id;
			this.name = name;
			this.price = price;
		}
	}

	static class CartItem {
		Product product;
		int quantity;

		CartItem(Product product, int quantity) {
			this.product = product;
			this.quantity = quantity;
		}
	}

	public static void main(String[] args) {
		Product laptop = new Product("E01", "Laptop", 999.99);
		Product headphones = new Product("E02", "Headphones", 99.99);
		Product phone = new Product("E03", "Phone", 499.99);
		List<CartItem> cart = new ArrayList<>();
		System.out.println("Shopping Cart Demo");
		cart.add(new CartItem(laptop, 5));
		cart.add(new CartItem(headphones, 5));
		cart.add(new CartItem(phone, 5));
		System.out.println("Added items to the cart.");
		cart.get(1).quantity = 4;
		System.out.println("Updated headphones quantity to 10.");
		cart.remove(1);
		System.out.println("Removed phone from the cart.");
		System.out.println("\n--- Current Cart Contents ---");
		double grandTotal = 0;
		for (CartItem item : cart) {
			double itemTotal = item.product.price * item.quantity;
			grandTotal += itemTotal;
			System.out.printf(" The Total Amount is =", item.product.name, item.quantity, item.product.price,
					itemTotal);
		}
		System.out.printf("GRAND TOTAL: %.2f\n", grandTotal);

	}
}