package linkedList;


public class LinkedListImpl implements LinkedList {
	ListItem head;

	@Override
	public Boolean isItemInList(String thisItem) {
		ListItem current = head; 
		while(current.getNext() != null){
			current = current.getNext();
			if (current.getData().equalsIgnoreCase(thisItem) == true) {
				System.out.println(thisItem + " is in the list");
				return true;
			}else {
				System.out.println(thisItem + " is not in the list");
				return false;
			}
		}
		return null;
	}

	@Override
	public Boolean addItem(String thisItem) {
		if (head == null) {
			head = new ListItem(thisItem);
		} 
		Boolean found = false;
		ListItem current = head; 
		while(current.getNext() != null && found == false){
			current = current.getNext();
			if (current.getData().equalsIgnoreCase(thisItem) == true) {
				found = true;
				return false;
			}
		}
		current.setNext(new ListItem(thisItem));
		return true;
	}

	@Override
	public Integer itemCount() {
		ListItem current = head; 
		int count = 0;
		while(current.getNext() != null ){
			current = current.getNext();
			count++;
		}
		System.out.println("The list has " + count + " items.");
		return count;
	}

	@Override
	public void listItems() {
		ListItem current = head; 
		while(current.getNext() != null ){
			current = current.getNext();
			System.out.println(current.getData());
		}
		
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		ListItem current = head; 
		ListItem previous = null;
		while(current.getNext() != null ){
			current = current.getNext();
			if (current.getData().equalsIgnoreCase(thisItem) == true) {
				previous.setNext(current.getNext());
			}
			previous = current;
		}
		return null;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		ListItem current = head; 
		ListItem previous = null;
		while(current.getNext() != null ){
			current = current.getNext();
			if (current.getData().equalsIgnoreCase(itemToInsertBefore) == true) {
				ListItem Item = new ListItem(newItem);
				previous.setNext(Item);
				Item.setNext(current);
			}
			previous = current;
		}
		return null;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		ListItem current = head; 
		while(current.getNext() != null ){
			current = current.getNext();
			if (current.getData().equalsIgnoreCase(itemToInsertAfter) == true) {
				ListItem Item = new ListItem(newItem);
				Item.setNext(current.getNext());
				current.setNext(Item);
			}
		}
		return null;
	}
	

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		//test2
	}
	
}
