package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		LinkedList l = new LinkedListImpl();
		l.addItem("one");
		l.addItem("two" );
		l.addItem("three");
		l.addItem("four");
		l.addItem("five");
		l.addItem("six");
		l.addItem("seven");
		l.addItem("eight");
		l.listItems();
		System.out.println();
		l.deleteItem("two");
		l.listItems();
		System.out.println();
		l.isItemInList("one");
		l.isItemInList("two");
		System.out.println();
		l.itemCount();
		System.out.println();
		l.insertBefore("two", "three");
		l.listItems();
		System.out.println();
		l.insertAfter("nine", "eight");
		l.listItems();
	}

}
