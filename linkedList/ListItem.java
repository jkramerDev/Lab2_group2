package linkedList;


public class ListItem {
	public String data;
	public ListItem next;
	
	public ListItem(String data) {
		this.data = data;
		this.next = null;
	}
	public ListItem getNext() {
		return next;
	}
	public String getData() {
		return data;
	}
	public void setNext(ListItem next) {
		this.next = next;
	}
	public void setData(String data) {
		this.data = data;
	}
}
