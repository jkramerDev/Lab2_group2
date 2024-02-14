package stack;

public interface Stack {
 
	public Boolean push(String s);
	public String pop();
	public Boolean isEmpty();
	public Boolean isFull();
	public int size();
	public String peek();
	public void display();
}
