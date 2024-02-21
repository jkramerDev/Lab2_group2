package linkedList;


public class LinkedListImpl implements LinkedList {
	ListItem head;

	@Override
	//Checks if an item is in the LinkedList
	public Boolean isItemInList(String thisItem) {
		ListItem current = head; 		//sets the current to head item in list
		while (current != null) {		//iterates thought the list until there is no "current" item
	        if (current.getData().equalsIgnoreCase(thisItem)) {			//checks if the current equals the item 
	            System.out.println(thisItem + " is in the list");
	            return true;
	        }
	        current = current.getNext();		//changes the current to the next item in the list
	    }

	    System.out.println(thisItem + " is not in the list");
	    return false;
	}

	@Override
	//Adds an item to the list
	public Boolean addItem(String thisItem) {
		if (head == null) {			//checks if the list is empty
			head = new ListItem(thisItem);		//adds the item to the head 
		} 
		Boolean found = false;		
		ListItem current = head; 		//sets the current to the first item in the list
		while(current.getNext() != null && found == false){		//repeats until the item is either found in list
			current = current.getNext();
			if (current.getData().equalsIgnoreCase(thisItem) == true) {
				found = true;
				return false;
			}
		}
		current.setNext(new ListItem(thisItem));		//adds the item to the end
		return true;
	}

	@Override
	//counts the items in the list
	public Integer itemCount() {
		ListItem current = head; 		//sets the current to head 
		int count = 0;			//initializes "count" to keep track of number of items
		while(current.getNext() != null ){  	//while the list has another item:
			current = current.getNext();
			count++;					//counts one more
		}	
		System.out.println("The list has " + count + " items.");
		return count;
	}

	@Override
	//prints every item in the console 
	public void listItems() {
		ListItem current = head; 			//sets the current to head
		while(current.getNext() != null ){			//while the list has another item:
			current = current.getNext();
			System.out.println(current.getData());		//prints the current nodes data
		}
		
	}

	@Override
	//deletes an item from the list
	public Boolean deleteItem(String thisItem) {
		ListItem current = head; 			//sets the current to head
		ListItem previous = null;				//sets the previous to null
		while(current.getNext() != null ){			//while the list has another item:
			current = current.getNext();
			if (current.getData().equalsIgnoreCase(thisItem) == true) {			//if the item matches the item to delete:
				previous.setNext(current.getNext());				//changes the next item for the item previous to deleted item
			}
			previous = current;				//sets previous to last checked item
		}
		return null;
	}

	@Override
	//inserts an item before another item
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		ListItem current = head; 				//sets the current to head
		ListItem previous = null;				//sets the previous to null
		while(current.getNext() != null ){			//while the list has another item:
			current = current.getNext();
			if (current.getData().equalsIgnoreCase(itemToInsertBefore) == true) {		//if the item matches the item to insert before
				ListItem Item = new ListItem(newItem);			//new item
				previous.setNext(Item);				//previous item "next" set to new item
				Item.setNext(current);				//item "next" set to item to insert before
			}
			previous = current;
		}
		return null;
	}

	@Override
	//inserts an item after the desired item 
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		ListItem current = head; 		//sets current to head
		while(current.getNext() != null ){		//while the list has another item:
			current = current.getNext();
			if (current.getData().equalsIgnoreCase(itemToInsertAfter) == true) {		//if the item matches the item to insert after
				ListItem Item = new ListItem(newItem);				//new item 
				Item.setNext(current.getNext());			//sets new items "next" to next of "current"
				current.setNext(Item);		//sets "current"s "next" to new item
			}
		}
		return null;
	}
	

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		//test
	}
	
}
