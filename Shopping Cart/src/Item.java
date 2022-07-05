import java.util.*;
public class Item {
	String item_id;
	String item_name;
	String item_desc;
	double item_price;
	int item_quantity = 0;
	static ArrayList<Item> itemsList = new ArrayList<Item>();// static ArrayList will be shared between all object
	Item(int i)
	{
		storeItem("101", "soap", "Park Avenue: Good quality", 45.00);
		storeItem("102", "oil", "Mahakosh: Pure Soyabeen", 175.00);
		storeItem("103", "milk", "Saras", 25.50);
		storeItem("104", "brush", "colgate: Good quality", 35.09);
		storeItem("105", "soap", "Lux: Good fragrance", 25.00);
	}
	Item(){ 						//default constructor for initializing an object
		this.item_desc = null;
		this.item_id = null;
		this.item_name =null;
		this.item_price = 0;
	}
	 void displayItem(Item i){      //Function to display values of a item passed as an argument
		String sep = "  |  ";
		System.out.print(i.item_id +sep+ i.item_name +sep+ i.item_desc +sep+ i.item_price);
		if(i.item_quantity!=0) {
			System.out.println(sep + i.item_quantity);
		}
		else {
			System.out.print("\n");
		}
	}
	void displayList(ArrayList<Item> list){  //Function to display all items stored in the list
		for(int i = 0;i<list.size();i++)
		{
			Item item = list.get(i);
			displayItem(item);
		}
	}
	
	void storeItem(String id, String name, String desc, double price) // Create and store new items to the items List
	{   
		Item i = new Item();
		i.item_desc = desc;
		i.item_id = id;
		i.item_name = name;
		i.item_price= price;
		itemsList.add(i);
	}
}
