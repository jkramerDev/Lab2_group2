package stack; 

public class StackImpl implements Stack {

	//initializes the elements array, the top int, and the size int
	private String [] elements;
	private int top;
	private int size;
	
	//constructor method
	public StackImpl(int size) {
		elements = new String[size];
		top = -1;
		this.size = size;
		
	}
	
	@Override
	//pushes a new item onto the stack (on top)
	public Boolean push(String s) {
		if (isFull())			//checks if the stack is full 
			return false;
		else					//if not full:
		{
			top++;				//adds 1 top top
			elements[top] = (String) s;		//adds the new item to the stack at "top" position 
			return true;
		}
	}

	@Override
	//pops the top item off stack
	public String pop() {
		String line = elements[top];		//takes the top item and puts it into a local variable 
		top--;				//reduces top index by 1
		return line;			//returns the line that used to be top 
	}

	@Override
	//checks if the list is empty 
	public Boolean isEmpty() {
		return top == -1; 		//if top is -1 then empty
	}

	@Override
	//checks if the list is full
	public Boolean isFull() {
		return top == size-1;		//if the top is the same as size - 1 
	}

	@Override
	//returns the size of the stack
	public int size() {
		System.out.println("Stack size: "+ size);		//prints the stack size 
		System.out.println("Items in Stack: "+ (top+1));		//prints the number of items in stack
		return this.size;			//returns the size 
	}

	@Override
	//peeks into stack, returns the top item 
	public String peek() {
		System.out.println(elements[top]);		//prints the top item 
		return elements[top];		//returns the top item 
	}


	@Override
	//displays the whole stack
	public void display() {
		for(int i = 0 ; i < size-1 ; i++) {			//for all the items in the array
			System.out.println(elements[i]);		//prints the item
		}
		
	}

 

}
