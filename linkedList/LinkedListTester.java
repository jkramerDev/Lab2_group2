package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		LinkedList route = new LinkedListImpl();		//initializes the LinkedList
		route.addItem("Grocery Store");					//adds item
		route.addItem("Chick-fil-a");					//adds item
		route.addItem("Beach");							//adds item
		route.addItem("Campus");						//adds item
		route.listItems();								//displays list
		System.out.println();
		route.isItemInList("Beach");					//checks if item is in list (true)
		System.out.println();
		route.isItemInList("Canada");					//checks if item is in list (false)
		System.out.println();
		route.deleteItem("Chick-fil-a");				//deletes item
		route.listItems();								//displays list
		System.out.println();
		route.insertBefore("Starbucks", "Beach");		//inserts item before "Beach"
		route.listItems();								//displays list
		System.out.println();
		route.insertAfter("Target", "Campus");			//inserts item 
		route.listItems();								//displays list
	}

}
