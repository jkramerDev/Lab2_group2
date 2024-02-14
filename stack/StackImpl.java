package stack; 

public class StackImpl implements Stack {

	private String [] elements;
	private int top;
	private int size;
	
	public StackImpl(int size) {
		elements = new String[size];
		top = -1;
		this.size = size;
		
	}
	
	@Override
	public Boolean push(String s) {
		if (isFull())
			return false;
		else
		{
			top++;
			elements[top] = (String) s;
			return true;
		}
	}

	@Override
	public String pop() {
		String line = elements[top];
		top--;
		return line;
	}

	@Override
	public Boolean isEmpty() {
		return top == -1;
	}

	@Override
	public Boolean isFull() {
		return top == size-1;
	}

	@Override
	public int size() {
		System.out.println("Stack size: "+ size);
		System.out.println("Items in Stack: "+ (top+1));
		return this.size;
	}

	@Override
	public String peek() {
		return elements[top];
	}


	@Override
	public void display() {
		for(int i = 0 ; i < size-1 ; i++) {
			System.out.println(pop());
		}
		
	}

 

}
