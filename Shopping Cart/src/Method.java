import java.util.*;

public class Method {

	static ArrayList<Item> itemCart = new ArrayList<Item>();

	void addToCart(Item item, int qty) { // Function to add item and quantity to Cart
		item.item_quantity = qty;
		itemCart.add(item);
	}

	void showCart() { // Display all items added in Cart
		for (int i = 0; i < itemCart.size(); i++) {
			Item item = itemCart.get(i);
			item.displayItem(item);
		}
	}

	int displayQty(Item item) { // Return quantity of a given item
		int qty = item.item_quantity;
		return qty;
	}

	void UpdateQty(Item item, int Qty) { // Change quantity of a given item
		item.item_quantity = Qty;
	}

	void deleteItem(Item item) { // Remove item from the Cart
		itemCart.remove(item);
	}

	Item findItem(ArrayList<Item> list, String id) { // Function to find an item using item id in an ArrayList
		for (int i = 0; i < list.size(); i++) {
			Item item = list.get(i);
			if (item.item_id.equalsIgnoreCase(id)) {
				return item;
			}
		}
		return null;
	}

	double displayBill() {
		double bill = 0;
		for (int i = 0; i < itemCart.size(); i++) {
			bill += itemCart.get(i).item_price * itemCart.get(i).item_quantity;

		}
		return bill;
	}
}
