
import java.util.*;
/* This is a program to implement shopping cart using Object Oriented Programming concepts 
 * Designed and Programmed by: Divya Prakash Charan
 * Date : 28-06-2022 
 */
public class ShoppingCart{
	public static void main(String[] args) {
		String msg = "Select an option   \n 1. Add Item to Cart \n "
				    +"2. Show Cart Items \n 3. Delete Item from Cart \n " 
				    +"4. Update quantity \n 5. Show Quantity of Item \n "
				    +"6. Calculate Bill  \n 7. Exit ";
		Item i = new Item(1);
		Scanner scan = new Scanner(System.in);
		while(true){
		System.out.println(msg);
		try {
			Method m = new Method();
			int choice = scan.nextInt();
			if(choice==7){
				break;	//Exit from the loop and finish program
			}
			switch(choice){
			case 1: i.displayList(Item.itemsList);
			System.out.print("Enter Item id to add item to Cart : ");
			String addItemid = scan.next();
			Item addItem = m.findItem(Item.itemsList, addItemid);  //Function to find an item in the List of stored item using item's unique id
			if(addItem!=null) 
			{
				System.out.println("Please enter quantity");
				int qty = scan.nextInt();
				m.addToCart(addItem, qty);	// Add item and quantity of item to the ArrayList of Cart
			} 
			else{
				System.out.println("Sorry ! Item unavailable");
			}
				break;
				
			case 2: m.showCart(); // Display all items which are added to the cart
				break;
				
			case 3: m.showCart();
			System.out.print("Enter Item id to delete item to Cart : ");
			String deleteItemID = scan.next();
			Item deleteItem = m.findItem(Item.itemsList, deleteItemID);
			m.deleteItem(deleteItem); // Function to remove an item from cart 
				break;
				
			case 4: m.showCart();
				System.out.print("Enter Item id to select item : ");
				Item updateItem = m.findItem(Item.itemsList, scan.next());
				System.out.println("Enter new quantity : ");
				int updateQty = scan.nextInt();
				m.UpdateQty(updateItem, updateQty);
				break;
				
			case 5: m.showCart();
			System.out.print("Enter Item id to select item : ");
			Item showItem = m.findItem(Item.itemsList, scan.next());
			System.out.println(showItem.item_quantity);				
				break;
				
			case 6: m.showCart();
				System.out.println(m.displayBill()); //Calculate total bill amount for items in Cart
				break;
				
			default:
				System.out.print("Please choose a correct option \n");
			}}
		
		catch(IllegalArgumentException e){
			System.out.print("Illegal input ! Please try again ");//Invalid input exception handling using try-catch 
		}}	
		System.out.println(" Thank you ! For using shopping cart program " ); //Program Executed Successfully
	}}